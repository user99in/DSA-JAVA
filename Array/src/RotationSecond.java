import java.net.SocketOption;
import java.util.Arrays;

public class RotationSecond {

    static void reverse(int[] arr, int start , int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=arr[start];
            start++;
            end--;
        }
    }
static void rotationByOne(int[] arr)
    {
        int n = arr.length;
        int k = 1;

        System.out.println("Original Array: " + Arrays.toString(arr));


        reverse(arr,0,n-1);
        reverse(arr , 0 , k-1);
        reverse(arr , k ,n-1);
    }

    public static void main(String[] args)
    {
    int[] arr ={1,2,3,4,5};
        rotationByOne(arr);
        System.out.println("Final Rotated Array: " + Arrays.toString(arr));
    }
}
