package Tree;

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

public class PreorderTraversal {

    static void PreorderTraversal(Node node){

        //Base Case
        if(node == null){
            return;
        }

        //Visit the current Node
        System.out.println(node.key+" ");

        //Recur the left sub-tree
        PreorderTraversal(node.left);

        //Recur the right sub-tree
        PreorderTraversal(node.right);

    }
    
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        PreorderTraversal(root);
    }
}
