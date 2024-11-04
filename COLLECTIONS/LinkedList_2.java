package COLLECTIONS;

public class LinkedList_2 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
//            Constructor :
            data = d;
            next = null;
        }
    }
    public static LinkedList_2 insert (LinkedList_2 list, int data)
    {
        Node new_node = new Node(data);
        if (list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while (last.next!=null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void print(LinkedList_2 list)
    {
        Node curr = list.head;
        System.out.print ("linked list is : ");
        while (curr!= null)
        {
            System.out.print (curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList_2 listt = new LinkedList_2 ();

        listt.insert(listt,1);
        listt.insert(listt,2);
        listt.insert(listt,3);

        print (listt);
    }
}
