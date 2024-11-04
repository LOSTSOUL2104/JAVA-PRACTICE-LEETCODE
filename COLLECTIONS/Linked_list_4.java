package COLLECTIONS;

public class Linked_list_4 {
    Linked_list_4.Node head;
    static class Node{
        int data;
        Linked_list_4.Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static Linked_list_4 insert(Linked_list_4 list,int data)
    {
        Linked_list_4.Node new_node = new Linked_list_4.Node (data);
        new_node.next = null;
        if (list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Linked_list_4.Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void print(Linked_list_4 list)
    {
        Linked_list_4.Node curr = list.head;
        while (curr!=null)
        {
            System.out.print (curr.data + " ");
            curr = curr.next;
        }
    }
}
