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

class Test{
    static void postorderTraversal(Node root){

        //Base case
        if(root == null){
            return;
        }

        //Recur to the left-subtree
        postorderTraversal(root.left);

        //Recur to the right-subtree
        postorderTraversal(root.right);

        //Visit the current node
        System.out.println(root.key+" ");

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        postorderTraversal(root);
    }
}