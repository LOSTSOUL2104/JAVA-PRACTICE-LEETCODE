package codess;

public class quick_sort {
    public static void main(String[] args) {
        int [] arr = {10,9,8,7,6,5,4,3,2,1,0};
        int n = arr.length;
        quicksort (arr,0,n-1);

        for (int val : arr)
        {
            System.out.print (val + " ");
        }
    }
    static void swap(int [] arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int  [] arr,int l,int h)
    {
        int pivot = arr[h];
        int i = l-1;
        for (int j = l; j <=h - 1 ; j++) {
            if (arr[j]<pivot)
            {
                i++;
                swap (arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i + 1;
    }
    static void quicksort(int [] arr, int l, int h)
    {
        if (l<h)
        {
            int pi = partition (arr,l,h);
            quicksort (arr,l,pi-1);
            quicksort (arr,pi+1,h);
        }
    }
}
