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

public class DiameterOfNode {

    static int height(Node root, int[] res){
        if(root == null) return 0;

        int lH = height(root.left, res);
        int rH = height(root.right, res);

        res[0] = Math.max(res[0],1+lH+rH);

        return 1+Math.max(lH,rH); 
    }

    static int diameterTree(Node root){
        int res[] = new int[1];
        height(root,res);
        return res[0];

    }
   public static void main(String[] args){
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.right.left = new Node(40);
    root.right.left.left = new Node(60);
    root.right.right = new Node(60);
    root.right.right.right = new Node(10);

    System.out.println(diameterTree(root));
   } 
}
