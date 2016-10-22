package HackerRank30Days;

/**
 * @author mkunaparaju
 *
 */
import java.util.*;
import java.io.*;
class Node1{
	
    Node1 left,right;
    int data;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}

 
 
public class Day22 {

	 public static int getHeight(Node1 root)
	 {
		 int ht = 0;
	     if(root == null){return -1; }
	     int lht = 1 + getHeight(root.left);
	     int rht = 1 + getHeight(root.right);
	     		if(lht>rht){ht = lht;}
	            else {ht = rht;}
	           // System.out.print(ht);
	        return ht; 
	        
	 }
	 
	 static void levelOrder(Node1 root){      
	    }
	 
	 
	 
	public static Node1 insert(Node1 root,int data){
        if(root==null){
            return new Node1(data);
        }
        else{
            Node1 cur;
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
            Node1 root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
          //  int height=getHeight(root);
          //  System.out.println(height);
        }	
}


