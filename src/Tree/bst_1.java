package Tree;

import java.util.*;

public class bst_1{
    public static void main(String[] args){
        Binarytree tree =new Binarytree();
        tree.root=new Node3(1);
        tree.root.left=new Node3(2);
        tree.root.right=new Node3(3);
        tree.root.left.left=new Node3(5);
        tree.root.left.right=new Node3(4);

        inOrderTraversal(tree.root);
    }
    public static void inOrderTraversal(Node3 current) {
        if(current==null){
            return;
        }
        inOrderTraversal(current.left);
        System.out.println(current.data );
        inOrderTraversal(current.right);
    }

}
class Node3{
    int data;
    Node3 left;
    Node3 right;

    Node3(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}
class Binarytree{
    Node3 root;

    Binarytree(){
        this.root=null;
    }
    void delete(int key){
        if (root==null)return;

        if(root.left ==null && root.right==null){
            if(root.data == key){
                root=null;
            }
            Queue<Node3>q=new LinkedList<>();
            q.add(root);
            Node3 keyNode3=null;
            Node3 last=null;
            Node3 temp=null;
            while(!q.isEmpty()){
                temp=q.poll();
                if(temp.data==key){
                    keyNode3=temp;
                }
                if(temp.left!=null){
                    last=temp;
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    last=temp;
                    q.add(temp.right);
                }
            }
            if(keyNode3 !=null){
                keyNode3.data=temp.data;
                if(last.right != null){
                    last.right=null;
                }
                else{
                    last.left=null;
                }
            }
        }
    }
}

class BST{
    Node3 root;

    BST(){
        this.root=null;
    }

    void insert(int val){
        root =add(val);
    }

    Node3 add(int val){
        if (root==null){
            root=new Node3 (val);
            return root;
        }
        if(val<root.data){
            root.left =add(val);
        }
        if(val>root.data){
            root.right=add(val);
        }
        return root;
    }
}