
import java.util.*;

public class swap_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = in.nextInt();
        int[] arr =new int [size]; 
        System.out.println("enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter positions to be swapped : ");
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        System.out.println("the swapped posn are : ");
        swap(arr,pos1,pos2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int pos1,int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
