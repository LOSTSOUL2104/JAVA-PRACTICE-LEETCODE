import java.util.Arrays;

public class array_2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        reverse(arr);

        System.out.println (Arrays.toString (arr));

    }

    public static void reverse(int[] arr) {
        int start = 0; int end = arr.length - 1; while (start < end) {
            int temp = arr[ start ];
            arr[ start ] = arr[ end ];
            arr[ end ] = temp;

            start++;
            end--;
        }
    }
}