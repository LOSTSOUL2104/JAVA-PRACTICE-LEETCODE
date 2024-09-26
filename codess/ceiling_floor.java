public class ceiling_floor {
    public static void main(String[] args) {
        int[] arr = {-12, -1, -0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 100;
        int ans = Index(arr, target);
        System.out.println(ans);
    }

    //return the index of smallest number >= target for ceiling
//return the index of largest number <= target for ceiling
    static int Index(int[] arr, int target) {
//            IF TARGET IS GREATER THAN GREATEST ELEMENT IN THE ARRAY
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
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
        return start;  //return this for ceiling
//            return end for floor
    }
}