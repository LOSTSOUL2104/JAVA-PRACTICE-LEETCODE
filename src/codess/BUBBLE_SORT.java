import java.util.Arrays;

public class BUBBLE_SORT {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        selection_sort(arr);
//        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex,last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int [] arr, int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) { // note the -1 here
                if (arr[j] > arr[j + 1]) { // swap if arr[j] is less than arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}