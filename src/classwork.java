import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
//    garbage_array();
//demo_arr();
//        int[] arr = {1,2,3,4,5,6,7};
//        int n = 7;
//        int k = 2;
//        rotate(arr, n, k);
//        System.out.print("After Rotation ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
        f_to_c (86);
    }

    private static void garbage_array() {
        int[] arr = new int[15];
        System.out.println(arr);
    }
    private static void demo_arr() {
        int [ ]arr = new int[16];
        int [] other = arr;
        System.out.println(arr);
        System.out.println(other);
    }
    static void fibo(int n) {
        int nums1 = 0;
        int nums2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(nums1 + " ");
            int nums3 = nums1 + nums2;
            nums1 = nums2;
            nums2 = nums3;
        }
    }
    static void hcf(int num1, int num2) {
        int hcf = 0;
        for (int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
    static void f_to_c(float temp) {
        if (temp > 110.9f)
        {
            System.out.println("invalid range");
            return;
        }
        else
        {
            float c;
            c= ((temp - 32) * 5) / 9;
            System.out.println("the temperature is " + c);
        }
    }

    private static void reverse(int [] arr,int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    private static void rotate(int[] arr,int n,int k)
    {
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }
}