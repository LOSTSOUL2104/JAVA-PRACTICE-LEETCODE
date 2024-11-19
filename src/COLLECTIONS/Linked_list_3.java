package COLLECTIONS;

public class Linked_list_3 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
             next = null;
        }
    }
    public static Linked_list_3 insert(Linked_list_3 list,int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void print(Linked_list_3 list)
    {
        Node curr = list.head;
        while (curr!=null)
        {
            System.out.print (curr.data + " ");
            curr = curr.next;
        }
    }
    public static Linked_list_3 deletebykey(Linked_list_3 list,int key)
    {
        Node curr = list.head,prev = null;
//        Key at head
        if (curr!= null && curr.data == key)
        {
            System.out.print ("found , deleted : " + key + " ");
            return list;
        }
//        Key at middle or smwhere :
        while (curr!=null && curr.data != key)
        {
            prev = curr;
            curr = curr.next;
        }
        if (curr!= null)
        {
            prev.next = curr.next;
            System.out.print (key + " found and deleted ");
        }

//        key not present :
        if (curr == null)
        {
            System.out.print ("not found ");
        }
        return list;
    }
    public static void main(String[] args)
    {
        Linked_list_3 list = new Linked_list_3 ();

        list = insert (list,1);
        list = insert (list,2);
        list = insert (list,3);
        list = insert (list,4);
        list = insert (list,5);
        list = insert (list,6);
        list = insert (list,7);
        list = insert (list,8);
        list = insert (list,9);

        print (list);
        System.out.println ();
        deletebykey (list,1);

        print (list);
        System.out.println ();
        deletebykey (list,4);

        print (list);
        System.out.println ();
        deletebykey (list,10);
        print (list);
    }
}
