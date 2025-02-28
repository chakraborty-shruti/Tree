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

public class InorderTraversal {

    static void InorderTraversal(Node node){
        //Base Case
        if(node == null){
            return;
        }

        //Recur on the Left Tree
        InorderTraversal(node.left);

        //Visit the current node
        System.out.println(node.key+" ");

        //Recur on the Right Tree
        InorderTraversal(node.right);

    }
    
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        InorderTraversal(root);
    }
}
