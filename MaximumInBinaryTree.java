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

public class MaximumInBinaryTree {

    static int maximumValue(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(node.key,Math.max(maximumValue(node.left),maximumValue(node.right)));
        }
    }
    public static void main(String[] args){
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

       System.out.println( maximumValue(root));
    }
}
