public class FIND_IN_MOUNTAIN_LEETCODE {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakindexmountainarray(arr);
        int firsttry = Index(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        return Index(arr, target, peak + 1, arr.length - 1);
    }

    public int peakindexmountainarray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int Index(int[] arr, int target, int start, int end) {
        ;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
// int mid = (start+end )/2; MIGHT BE POSSIBLE THIS COULD EXCEED THE RANGE OF JAVA LIKE FOR VERY LARGE NUMBERS
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }
}


