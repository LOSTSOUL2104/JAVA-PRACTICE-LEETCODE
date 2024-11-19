package HEAPS;

import java.util.Arrays;

public class Heaps_1 {
    int [] arr;
    int maxSize;
    int heapSize;
    Heaps_1(int maxSize)
    {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        heapSize = 0;
    }
    void maxHeapify(int i)
    {
        int l = lchild(i);int r = rchild(i);
        int largest = i;
        if (l<heapSize && arr[r]>arr[largest])
        {
            largest = l;
        } else if (r<heapSize && arr[r]>arr[largest]) {
            largest = r;
        }
        if (largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify (largest);
        }
    }
    int parent (int i)
    {
        return (i-1) / 2;
    }

     int rchild(int i) {
        return (i *2 + 2);
    }

     int lchild(int i) {
        return (i*2 + 1);
    }
    int removemax()
    {
        if (heapSize<=0)
        {
            return Integer.MIN_VALUE;
        }
        if (heapSize == 1){
            heapSize --;
            return arr[0];
        }

        int root = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize --;

        maxHeapify (0);
        return root;
    }

    void increasekey(int i , int newVal){
        arr[i] = newVal;
        while(i != 0 && arr[parent (i)]< arr[i])
        {
            int temp = arr[i];
            arr[i] = arr[parent (i)];
            arr[parent (i)] = temp;
            i = parent (i);
        }
    }
    int getMax()
    {
        return arr[0];
    }
    int cursize()
    {
        return heapSize;
    }
    void deletekey(int i)
    {
        increasekey (i, Integer.MAX_VALUE);
        removemax ();
    }
    void insertkey(int x)
    {
        if (heapSize == maxSize)
        {
            System.out.println ("could not insert key!!");
            return;
        }
        heapSize++;
        int i = heapSize - 1;
        arr[i] = x;
        while(i != 0 && arr[parent (i)]<arr[i])
        {
            int temp = arr[i];
            arr[i] = arr[parent (i)];
            arr[parent (i)] = temp;
            i = parent (i);
        }
    }

    public static void main(String[] args) {
        Heaps_1 h = new Heaps_1 (10);

        int k , i , n = 10;
        System.out.println ("enter 10 keys : ");
        h.insertkey (3);
        h.insertkey (12);
        h.insertkey (22);
        h.insertkey (123);
        h.insertkey (1);
        h.insertkey (19);
        h.insertkey (32);
        h.insertkey (2);
        h.insertkey (99);
        h.insertkey (56);

        System.out.println ("the current size is : " + h.cursize ());

        System.out.println ("the current max element is : " + h.getMax ());

        h.deletekey (3);

        System.out.println ("now we will delete 3 if it is present");

        System.out.println ("size of heap after deletion of 2 : " + h.cursize ());

        System.out.println ("inserting 2 keys : ");

        h.insertkey (100);
        h.insertkey (200);

        System.out.println ("the current size is : " + h.cursize ());
        System.out.println ("the current max element is : " + h.getMax ());

        System.out.println ("printing the heap : ");
        System.out.println (Arrays.toString (h.arr));

    }
}
