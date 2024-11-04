package HASHING;

public class linear_probing {
        static int capacity = 20;
        static int size = 0;
        static HashNode[] arr = new HashNode[capacity];
        static HashNode dummy = new HashNode(-1, -1);

        static void insert(int key,int value)
        {
            HashNode temp = new HashNode (key,value);
            int hashIndex = key % capacity;
            while(arr[hashIndex] != null && arr[hashIndex].key != key && arr[hashIndex].key!=-1)
            {
                hashIndex++;
                hashIndex %= capacity;
            }
            if (arr[hashIndex] == null || arr[hashIndex].key == -1)
            {
                size ++;
            }
            arr[hashIndex] = temp;
        }
        static int deletekey(int key)
        {
            int hashIndex = key % capacity;
            while(arr[hashIndex]!=null)
            {
                if (arr[hashIndex].key == key)
                {
                    arr[hashIndex] = dummy;
                    size--;
                    return 1;
                }
                hashIndex ++;
                hashIndex &= capacity;
            }
            return 0;
        }
        static int find(int key)
        {
            int hashindex = key % capacity;
            int counter = 0;
            while(arr[hashindex] != null )
            {
                if (counter>capacity)
                {
                    break;
                }
                if (arr[hashindex].key == key)
                {
                    return arr[hashindex].value;
                }hashindex++;
                hashindex %= capacity;
                counter++;
            }
            return -1;
        }
    public static void main(String[] args) {
        insert (1,1);
        insert (2,15);
        insert (3,155);
        insert (4,1555);
        insert (5,15555);

        if (find (3) != -1)
        {
            System.out.println ("value of key 4 = " + find (4));
        }
        else {
            System.out.println ("doesn't exist");
        }
        if (deletekey (3) ==1)
        {
            System.out.println ("node 4 deleted!");
        }
        else
        {
            System.out.println ("key not exist");
        }
        if (find (3) != -1)
        {
            System.out.println ("value of key 4 = " + find (4));
        }
        else {
            System.out.println ("doesn't exist");
        }
    }
    }


class HashNode{
    int key;
    int value;
    public HashNode(int key,int value)
    {
        this.key = key;
        this.value = value;
    }
}
