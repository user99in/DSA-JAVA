public class FirstActivity {
    public static void main(String[] args) {

        // 1 Declare and initialize the array
        int[] arr = {10, 20, 30, 40};
        int n = arr.length; // size of the array

        // 2 Traverse array
        // Loop through all elements of the array and print them
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        /*
          Time Complexity: O(n) – The loop visits each element once
          Space Complexity: O(1) – Only one extra variable 'i' is used
         (The array itself is considered input, not extra space)
        */
    }
}
