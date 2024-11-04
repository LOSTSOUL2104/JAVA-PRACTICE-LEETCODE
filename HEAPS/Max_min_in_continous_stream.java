package HEAPS;
import java.util.*;
public class Max_min_in_continous_stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        System.out.println("Enter numbers continuously (Type 'exit' to stop):");

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();


                minHeap.offer(num);
                maxHeap.offer(num);

                        System.out.println("Current Max: " + maxHeap.peek());
                System.out.println("Current Min: " + minHeap.peek());
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input, please enter an integer or 'exit' to stop.");
                }
            }
        }

        System.out.println("Final Max: " + maxHeap.peek());
        System.out.println("Final Min: " + minHeap.peek());
        sc.close();
    }

}
