/**
 * 
 */
package HackerRank30Days;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * @author mkunaparaju
 *
 */
public class Day10 {
	 public static void main(String[] args) {
		 
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        Stack<Integer> st = new Stack<Integer>();
	        int max =0;
	        int newmax=0;
	        int count =0;
	        while(n>0)
	        {
	        	int rem = n%2;
	        	n = n/2;
	        	st.push(rem);
	        }
	        
	        while(!st.isEmpty())
	        {
	        	int popped = st.pop();
	        	if(popped ==1)
	        	{
	        		count = count +1;
	        		newmax = count;
	        		if(max < newmax)
	        		{
	               		max = newmax;
	        		}
	        	}
	        	else{
	        		count =0;
	        		
	         		
	        		newmax = 0;
	        	}
	        	System.out.print(popped);
	        }
	        System.out.println(max);
	    
	 }
}
