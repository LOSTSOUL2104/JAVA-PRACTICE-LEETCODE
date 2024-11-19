import java.util.Arrays;
import java.util.Scanner;

public class SEARCH_IN_RANGE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR ARRAY SIZE ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("ENTER YOUR TARGET ");
        int target = in.nextInt();
        System.out.print("ENTER YOUR START ");
        int start = in.nextInt();
        System.out.print("ENTER YOUR END ");
        int end = in.nextInt();
        System.out.println(Arrays.toString(arr));

        System.out.println(LinearSearch(arr, target, start, end));
    }

    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
