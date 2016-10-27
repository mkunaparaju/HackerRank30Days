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
public class Day29 {
	public static void main(String[] args) {
	       List<Integer> andList = new ArrayList();
			Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int k = in.nextInt();
	            int max =0;
	            for(int i=1; i<=n; i++)
	            {
	            	for(int j = i+1; j<=n; j++)
	            	{
	            		int newnum = i&j;
	            		//System.out.println("A&B  " + newnum  );
	            		if(newnum >= max && newnum<k){
	            			max = newnum;
	            		}            		
	            	}
	            }
	            
	        andList.add(max);
	        
	        }
	        
	        for(int i : andList)
	        {
	        	System.out.println(i);
	        }
	    }
}
