package HASHING;

public class hash_1 {
    public static void main(String[] args) {

    }
}
class HashtableLinear{
    String [] Hashtable;
    int [] arr;
    int capacity;
    HashtableLinear(int cap)
    {
        capacity = cap;
        Hashtable = new String[cap];
    }
    int hash(String key)
    {
        return key.hashCode ()%capacity;
    }
    void insert(String key)
    {
        int index = hash (key);
        while(Hashtable[index]!=null){
            index = (index + 1) %capacity;
        }
        Hashtable[index] = key;
    }
    void display(String key){
        for (int i = 0; i <capacity ; i++) {
            if (Hashtable[i] != null)
            {
                System.out.println (Hashtable[i]);
            }
            else
            {
                System.out.println ("key not found");
            }
        }
    }
}
