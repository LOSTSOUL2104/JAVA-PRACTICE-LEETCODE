package HASHING;

public class quadratic_probing {
    static void printArray(int [] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print (arr[i] + " ");
        }
    }
    static void hashing(int [] table,int[] arr){
        int tsize = table.length;
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            int hv = arr[i]% tsize;
            if (table[hv] == -1)
            {
                table[hv] = arr[i];
            }
            else
            {
                for (int j = 0; j <=tsize ; j++) {
                    int t = (hv + j * j) %tsize;
                    if (table[t] == -1)
                    {
                        table[t] = arr[i];
                        break;
                    }
                }
            }
        }
        printArray (table);
    }

    public static void main(String[] args) {
        int [] arr = {20,30,40,50,60,600,4239847,389742398,4834738};
        int tsize = 11;
        int hash_table[] = new int[tsize];
        for (int i = 0; i <tsize ; i++) {
            hash_table[i] = -1;
        }
        hashing (hash_table,arr);
    }
}
