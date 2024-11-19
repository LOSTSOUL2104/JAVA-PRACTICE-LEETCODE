package Tree;

public class bst_2 {
    public static void main(String[] args) {
        Node6 root = new Node6 (50);
//        root.left = new Node6(30);
//        root.right = new Node6(70);
//        root.left.left = new Node6(20);
//        root.left.right = new Node6(40);
//        root.right.left = new Node6(60);
//        root.right.right = new Node6(80);
        root = insert (root, 50); root = insert (root, 30); root = insert (root, 20); root = insert (root, 40);
        root = insert (root, 70); root = insert (root, 60); root = insert (root, 80); root = insert (root, 90);

        inorder (root); System.out.println (); System.out.println (search (root, 90) != null ? "Found" : "Not Found");
        System.out.println (search (root, 89) != null ? "Found" : "Not Found");
        System.out.println (search (root, 50) != null ? "Found" : "Not Found");
        System.out.println (search (root, 8) != null ? "Found" : "Not Found");

        int x = 15;
//        root = delete (root,x);

        inorder (root);

        System.out.println (search (root, 15) != null ? "Found" : "Not Found"); Node6 p = root.left;
        Node6 q = root.right; Node6 ancestor = lca (root, p, q);
        System.out.println ("LCA of " + p.key + " and " + q.key + " is: " + ancestor.key);
        int small = ksmall (root,3);
        System.out.println (small);

    }

    static Node6 search(Node6 root, int key) {
        if (root == null || root.key == key) {
            return root;
        } if (root.key < key) {
            return search (root.right, key);
        } return search (root.left, key);
    }

    static Node6 insert(Node6 root, int key) {
        if (root == null) {
            return new Node6 (key);
        } if (root.key == key) {
            return root;
        } if (key < root.key) {
            root.left = insert (root.left, key);
        } else {
            root.right = insert (root.right, key);
        } return root;
    }

    static Node6 delete(Node6 root, int x) {
        if (root == null) {
            return root;
        } if (root.key > x) {
            root.left = delete (root.left, x);
        } if (root.key < x) {
            root.right = delete (root.right, x);
        } else {
            if (root.left == null) {
                return root.left;
            } if (root.right == null) {
                return root.right;
            } Node6 succ = getSuccessor (root); root.key = succ.key; root.right = delete (root.right, succ.key);
        } return root;
    }

    static Node6 getSuccessor(Node6 curr) {
        curr = curr.right; while (curr != null && curr.left != null) {
            curr = curr.left;
        } return curr;
    }

    static void inorder(Node6 root) {
        if (root == null) {
            return;
        } inorder (root.left); System.out.print (root.key + " "); inorder (root.right);
    }

    static Node6 lca(Node6 root, Node6 p, Node6 q) {
        if (p.key < root.key && q.key < root.key) {
            return lca (root.left, p, q);
        } else if (p.key > root.key && q.key > root.key) {
            return lca (root.right, p, q);
        } else {
            return root;
        }
    }

    public static int num = 0, cnt = 0;

    static int ksmall(Node6 root, int k) {
        cnt = k; helper (root); return num;
    }

    static void helper(Node6 n) {
        if (n.left != null) {
            helper (n.left);
        } cnt--; if (cnt == 0) {
            num = n.key; return;
        } if (n.right != null) {
            helper (n.right);
        }
    }
}

class Node6 {
    int key;
    Node6 left, right;

    public Node6(int item) {
        key = item; left = right = null;
    }
}
