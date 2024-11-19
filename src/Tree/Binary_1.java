package Tree;

import com.sun.source.tree.BinaryTree;

public class Binary_1 {
    public static void main(String[] args) {
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;
    }
}
class Node{
    private final int data;
    public int key;
    Node root;
    Node left;
    Node right;
    public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

