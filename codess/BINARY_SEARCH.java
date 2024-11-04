package codess;

public class BINARY_SEARCH {
    public static void main(String[] args) {
        int[] arr = {-12, -1, -0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 1;
//        int ans = Index(arr, target);
//        System.out.println(ans);
//        System.out.print(binary(arr,target,0,arr.length - 1));
    }
//    RECURSIVE APPROACH
    static int binary(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binary(arr, target, mid + 1, end); // search in right half
        } else {
            return binary(arr, target, start, mid - 1); // search in left half
        }
    }

//    static int Index(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        boolean isAsc = arr[start] < arr[end];
//        while (start <= end) {
//// int mid = (start+end )/2; MIGHT BE POSSIBLE THIS COULD EXCEED THE RANGE OF JAVA LIKE FOR VERY LARGE NUMBERS
//            int mid = start + (end - start) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            }
//            if (isAsc) {
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            } else {
//                if (target > arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//
//            }
//
//        }
//        return -1;
//    }
    static int binary_search(int []arr,int target)
    {
        int start = 0;
        int end = arr.length -1;
        while (start<end)
        {
            int mid = start + (end - start) /2;
            if (target>arr[mid])
            {
                start = mid +1;
            }
            if (target<arr[mid])
            {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

