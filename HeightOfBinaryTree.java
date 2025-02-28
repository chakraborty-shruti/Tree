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

public class HeightOfBinaryTree {

    static int height(Node node){
        if(node == null){
            return 0;
        }
        
        //Compute height of left and Right sub-tree
        int lHeight = height(node.left);
        int rHeight = height(node.right);

        int result = Math.max(lHeight, rHeight)+1;

        return result;
    }
    
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.left = new Node(50);

        System.out.println(height(root));
    }
}
