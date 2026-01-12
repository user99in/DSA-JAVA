import java.util.Arrays;

public class ArrayRotation {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateByOne(int[] arr) {
        int n = arr.length;
        int k = 1;

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Step 1
        reverse(arr, 0, n - 1);
        System.out.println("After reversing whole array: " + Arrays.toString(arr));

        // Step 2
        reverse(arr, 0, k - 1);
        System.out.println("After reversing first " + k + " element: " + Arrays.toString(arr));

        // Step 3
        reverse(arr, k, n - 1);
        System.out.println("After reversing remaining elements: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        rotateByOne(arr);

        System.out.println("Final Rotated Array: " + Arrays.toString(arr));
    }
}
