package Tree;

public class bt_3_questions {
    public static void main(String[] args) {
        Node5 root = new Node5(1);
        root.left = new Node5(2);
        root.right = new Node5(3);
        root.left.left = new Node5(4);
        root.left.right = new Node5(5);
        root.left.right.right = new Node5(6);
        root.left.right.right.right = new Node5(7);
        Node5 solution = new Node5 (root.data);
        if (solution.balanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
        System.out.println ("diameter is : " + root.diameterOfBinaryTree (root));
    }
}
class Node5{
    int data;
    Node5 left,right;
    public Node5(int data)
    {
        this.data = data;
        left = right = null;
    }
    public int height(Node5 root)
    {
        if (root == null)
        {
            return -1;
        }
        return 1 + Math.max (height (root.left),height (root.right));
    }
    public boolean balanced(Node5 root)
    {
        if (root == null)
        {
            return true;
        }
        if (!balanced (root.left))
        {
            return false;
        }
        if (!balanced (root.right))
        {
            return false;
        }
        int l_height = height (root.left);
        int r_height = height (root.right);
        if (Math.abs (l_height - r_height)<=1)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public int diameterOfBinaryTree(Node5 root) {
        if(root == null)
        {
            return 0;
        }
        int l = height(root.left);
        int  r = height(root.right);
        int diameter = l + r;
        int l_d = diameterOfBinaryTree(root.left);
        int r_d = diameterOfBinaryTree(root.right);
        return  Math.max(diameter,Math.max(l_d,r_d));
    }
}
