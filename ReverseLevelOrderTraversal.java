import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

public class ReverseLevelOrderTraversal {

    static void reverseLevelOrder(Node root){
        if(root == null) return;

        Stack<Node> st = new Stack<>();
        Queue<Node> q = new LinkedList<>() ;
        q.add(root);
            
        while(q.isEmpty() == false){
            Node curr = q.poll();
            st.push(curr);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }

        while(st.isEmpty() == false){
            Node curr = st.pop();
            System.out.println(curr.key+" ");
        }
    }
    
    public static void main(String[] args){
        Node root = new Node(10);
        
        root.left = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);

        root.right = new Node(30);
        root.right.right = new Node(6);

        reverseLevelOrder(root);
    }
}
