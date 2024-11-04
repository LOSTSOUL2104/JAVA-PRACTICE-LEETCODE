package RECURSION;

public class
RECURSION_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        System.out.println(sorted(arr, 0));
        System.out.println(Linear_Search_Recursive(arr, 3,0));
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    static int Linear_Search_Recursive(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return Linear_Search_Recursive(arr, target, index + 1);
        }
    }
}
