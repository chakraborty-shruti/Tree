import java.util.*;

class Node{
    int key;
    Node left;
    Node right;

    Node(int k){
        key = k;
        left = null;
        right = null;
    }
}

public class BinaryTreeToDLL {

    static Node prev = null;

    static Node BinaryTreeToDLL(Node root){
        if(root == null) return root;
        Node head = BinaryTreeToDLL(root.left);
        if(prev == null){ head = root;}
        else{
            root.left = prev;
            root.right = root;
        }
        prev = root;
        BinaryTreeToDLL(root.right);
        return head;
    }

    static void printList(Node head){
        while(head != null){
            System.out.println(head.key+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(5);
        root.right.left = new Node(4);

        BinaryTreeToDLL(root);
    }
}
