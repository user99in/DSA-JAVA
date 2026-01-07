public class SecondActivity {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Time Complexity: O(log n) - Logarithmic time");
    }
}
