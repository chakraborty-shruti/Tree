//This program used to check if given binary tree is a true BinarySearch Tree or not 

class Node{
    int key;
    Node left;
    Node right;

    Node(int k){
        key = k;
        Node left = null;
        Node right = null;
    }
}

public class CheckForBST {
    static boolean isBSTUtil(Node root, int min, int max){
        if(root == null) return true;

        //If the current nodes data is not in the valid range
        if(root.key < min || root.key > max){
            return false;
        }

        return isBSTUtil(root.left, min, root.key-1) && isBSTUtil(root.right, root.key+1, max);
    }

    static boolean isBST(Node root){
        return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static void main(String[] args){
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.right.right = new Node(7);
        root.left.left.left = new Node(1);

        if(isBST(root)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}