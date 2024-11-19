package codess;
public class merge_sort {
    public static void main(String[] args) {
    int[] arr = {12,11,23,122,121,21,212,33,443,4343,323,7,6,5,4,3,32,2,23,23,2,32,32,32,3,2,32,32,3,2,32,32,32343223,64,532,5,345,235,34,52345,45643643,64,36,43,43,643,543,54,5,435,23,53,5,435,34,54,5,45,4,543,5,4,54,5,45,4,543,54,35,43,543,5,476,54,6,876,7,435,635,76454567};
        System.out.print ("given arr : ");
        printArray (arr);

        merge_sort ob = new merge_sort ();
        ob.sort (arr,0,arr.length - 1);

        System.out.println ("sorted : ");
        printArray (arr);
    }
    void merge(int [] arr,int l, int m , int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[ n1 ];
        int[] R = new int[ n2 ];

        for (int i = 0; i < n1; i++) {
            L[ i ] = arr[ l + i ];
        }
        for (int j = 0; j < n2; j++) {
            R[ j ] = arr[ m + 1 + j ];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[ i ] <= R[ j ]) {
                arr[ k ] = L[ i ];
                i++;
            } else {
                arr[ k ] = R[ j ];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[ k ] = L[ i ];
            i++;
            k++;
        }

        while (j < n2) {
            arr[ k ] = R[ j ];
            j++;
            k++;
        }
    }
    void sort(int [] arr,int l, int r)
    {
        if (l<r)
        {
            int m = l + (r-l)/2;
            sort (arr,l,m);
            sort (arr,m+1,r);
            merge (arr,l,m,r);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
