package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal_1 {

    static class Node1 {
        int data;
        Node1 left, right;

        public Node1(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static void inorder(Node1 node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    static void preorder(Node1 node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    static void postorder(Node1 node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    static void levelOrder(Node1 root) {
        if (root == null) {
            return;
        }
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node1 temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        System.out.println(); // Print a new line after level order
    }

    static void printLevelWise(Node1 root) {
        if (root == null) {
            return;
        }
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                Node1 temp = q.poll();
                System.out.print(temp.data);
                if (i < levelSize - 1) {
                    System.out.print(" ");
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            System.out.println(); // Print a new line after each level
        }
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);

        System.out.print("The inorder traversal is: ");
        inorder(root);
        System.out.println();

        System.out.print("The postorder traversal is: ");
        postorder(root);
        System.out.println();

        System.out.print("The preorder traversal is: ");
        preorder(root);
        System.out.println();

        System.out.print("Level order traversal: ");
        levelOrder(root);
        System.out.println ("level order order wise :");
        printLevelWise (root);
    }
}