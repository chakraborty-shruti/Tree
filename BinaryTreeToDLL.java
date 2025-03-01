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

    static void BToDLL(Node root, Node head){
        if(root == null) return;
        BToDLL(root.right, head);
        root.right = head;
        if(head != null){
            head.left = root;
        }
        head = root;
        BToDLL(root.right, head); 
    }

    static void BinaryTreeToDLL(Node root){
        Node head = null;
        BToDLL(root,head);
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
