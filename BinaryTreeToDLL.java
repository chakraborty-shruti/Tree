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

    static Node prev = null;//Track of previous node
    static Node head = null;//Head of DLL

    static Node BinaryTreeToDLL(Node root){
        if(root == null) return null;

        //Convert left subtree
        Node head = BinaryTreeToDLL(root.left);

        //Process the current node
        if(prev == null){ 
            head = root;
        }
        else{
            root.left = prev;//Connect current node to previous node
            prev.right = root;//Connect previous node to current node
        }
        prev = root;// Move prev to current

        //Convert right subtree
        BinaryTreeToDLL(root.right);

        return head;//Return the head of DLL
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
