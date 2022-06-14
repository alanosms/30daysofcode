import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
      Queue<Node> treenodeQueue = new ArrayDeque<>();
      treenodeQueue.add(root);
      Node currentNode = null;

      while(treenodeQueue.peek() != null){
        currentNode = treenodeQueue.remove();
        System.out.print(currentNode.data + " ");
        
        if (currentNode.left != null){
            treenodeQueue.add(currentNode.left);
        }
        if (currentNode.right != null){
            treenodeQueue.add(currentNode.right);
        }
      }
      
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}