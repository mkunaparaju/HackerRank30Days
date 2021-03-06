/**

 * 
 */
package HackerRank30Days;
import HackerRank30Days.Node;

import java.io.*;
import java.util.*;

/**
 * @author mkunaparaju
 *
 */
public class Day24 {
	public static Node removeDuplicates(Node head) 
	{
		Set<Integer> uniqSet = new HashSet();
		uniqSet.add(head.data);
		Node cur = head;
		Node newList = new Node(head.data);
		Boolean isUniq;
		while(cur.next != null)
		{
			isUniq = uniqSet.add(cur.next.data);
			if(isUniq)
			{
				insert(newList, cur.next.data);
			}
			cur = cur.next;
		}
		
		return newList;
		 	
	}
	 
	 public static void main(String args[])
     {
		 
           Scanner sc=new Scanner(System.in);
           Node head=null;
           int T=sc.nextInt();
           while(T-->0){
               int ele=sc.nextInt();
               head=insert(head,ele);
           }
           head=removeDuplicates(head);
           display(head);

    }
	 
	 
	 public static  Node insert(Node head,int data)
	    {
	        Node p=new Node(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	            Node start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	    public static void display(Node head)
	        {
	              Node start=head;
	              while(start!=null)
	              {
	                  System.out.print(start.data+" ");
	                  start=start.next;
	              }
	        }
}
