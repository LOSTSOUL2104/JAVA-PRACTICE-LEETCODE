package HEAPS;

import java.util.Scanner;

public class heap_sort_2 {
    static void print(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print (arr[i] + " ");
        }
        System.out.println ();
    }

    static void heapify(int[] arr,int n,int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[ l ] > arr[ largest ]) {
            largest = l;
        }
        if (r < n && arr[ r ] > arr[ largest ]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[ i ];
            arr[ i ] = arr[ largest ];
            arr[ largest ] = temp;

            heapify (arr,n,largest);
        }
    }
    static void heapsort(int[] arr)
    {
        int n = arr.length;
        for (int i = n/2-1; i >=0 ; i--) {
            heapify (arr,n,i);
        }
        for (int i = n-1; i >0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify (arr,i,0);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int size = in.nextInt ();

        int[]arr = new int[size];

        for (int i = 0; i <size ; i++) {
            arr[i] = in.nextInt ();
        }
        System.out.println ("your array is : ");
        print (arr);

        System.out.println ("sorted array is : ");
        heapsort (arr);
        print (arr);
    }
}
