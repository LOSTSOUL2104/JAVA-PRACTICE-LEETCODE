package RECURSION;

public class ROTATED_BINARY_SEARCH {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(Binary_Search(arr, 8, 0, arr.length - 1));
    }

    static int Binary_Search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && arr[mid] >= target) {
                return Binary_Search(arr, target, start, mid - 1);
            } else {
                return Binary_Search(arr, target, mid + 1, end);
            }
        }
        if (arr[mid] <= target && arr[end] >= target) {
            return Binary_Search(arr, target, mid + 1, end);
        }
        return Binary_Search(arr, target, start, mid - 1);
    }
}
