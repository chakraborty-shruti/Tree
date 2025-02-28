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

public class RightViewOfTree {
    static void printRight(Node root){
        if(root == null) return;

        //Queue for a level order traversal
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (q.isEmpty() == false) {
            
            int count = q.size();

            for(int i=0;i<count;i++){
                Node curr = q.poll();
                if(i == count -1) System.out.println(curr.key+" ");
                if(curr.left != null) q.add(curr.left);
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

        printRight(root);
    }
}
