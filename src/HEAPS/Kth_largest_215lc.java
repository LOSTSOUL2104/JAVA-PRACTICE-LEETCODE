package HEAPS;

import java.util.PriorityQueue;

public class Kth_largest_215lc {
    public static void main(String[] args) {
        int[] arr = {2, 42, 11, 22, 33};
        int k = 2;
        Kth_largest_215lc solution = new Kth_largest_215lc();
        int result = solution.findKthLargest(arr, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mh = new PriorityQueue<>();
        for (int el : nums) {
            mh.add(el);
            if (mh.size() > k) {
                mh.poll();
            }
        }
        return mh.peek();
    }
}
