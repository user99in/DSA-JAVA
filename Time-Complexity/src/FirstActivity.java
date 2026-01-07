/**
 * Time Complexity: O(n) - Linear time
 */
public class FirstActivity {

    public static void main(String[] args) {
        System.out.println("Time Complexity demonstration with Java");

        int n = 4;

        for (int i = 0; i <= n; i++)  // O(n/2) =O(n)
        {
            System.out.println(i);
        }
        for (int j = 0; j <= n; j++)          //O(2n) = O(n)
        {
            System.out.println(j);
        }

        System.out.println("Time Complexity: O(n) - Linear time");

    }
}
