package org.example;

import java.sql.*;
import java.util.Scanner;

class StudentCRUD {

    static final String URL =
            "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "admin";

    // CREATE
    public static void insertStudent(String name, int age) {
        String sql = "INSERT INTO student (name, age) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            int rows = ps.executeUpdate();
            System.out.println(rows + " student inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ (FIXED & SAFE)
    public static void getAllStudents() {
        String sql = "SELECT * FROM student";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nID | NAME  | AGE");
            System.out.println("----------------");

            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.println(
                        rs.getInt(1) + "  | " +
                                rs.getString(2) + "  | " +
                                rs.getInt(3)
                );
            }

            if (!hasData) {
                System.out.println("No records found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public static void updateStudent(int id, int age) {
        String sql = "UPDATE student SET age=? WHERE id=?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, age);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " student updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id=?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " student deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // MAIN MENU
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT CRUD MENU =====");
            System.out.println("1. Insert Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Age");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    insertStudent(name, age);
                    break;

                case 2:
                    getAllStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    updateStudent(uid, newAge);
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    int did = sc.nextInt();
                    deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Program exited 👋");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
