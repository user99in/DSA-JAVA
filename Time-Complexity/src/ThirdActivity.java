public class ThirdActivity {
    public static void main(String[] args)
    {
        int n = 5;
        for(int i = 0;i < n ; i++)
        {
            for (int j = 0; j < n ; j++ )
            {
                System.out.println(i + j);
            }
        }
        System.out.println("Time Complexity: O(n²) - Quadratic time");

    }
}
