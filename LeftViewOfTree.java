import java.util.LinkedList;
import java.util.Queue;

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

public class LeftViewOfTree {
    static void printLeft(Node root){
        if(root ==null) return;

        // Queue for level order traversal
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(q.isEmpty() == false){
             // Number of nodes at the current level
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                 // If it's the first node of the current level
                if(i == 0) System.out.println(curr.key+" ");

                 // Enqueue First Child
                if(curr.left != null) q.add(curr.left);

                // Enqueue right child
                if(curr.right != null) q.add(curr.right);
            }
        }
    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        printLeft(root);
    }
}
