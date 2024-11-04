package Tree;

import java.util.Scanner;

public class bt_2 {
    public void BinaryTree()
    {

    }
    private static class Node4
    {
        int data;
        Node4 left;
        Node4 right;
        public Node4(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    public Node4 root;
    public void populate(Scanner scanner)
    {
        System.out.println ("enter the root node : ");
        int value = scanner.nextInt ();
        root = new Node4 (value);
        populate (scanner,root);
    }
    private void populate(Scanner scanner,Node4 node4)
    {
        System.out.println ("Enter left node if you wanna : ");
        boolean left = scanner.nextBoolean ();
        if (left)
        {
            System.out.println ("enter your value of : " + node4.data);
            int data = scanner.nextInt ();
            node4.left = new Node4 (data);
            populate (scanner,node4.left);
        }


    }
}
