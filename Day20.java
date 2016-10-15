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
public class Day20 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int totalSwap= 0;
	        for (int i = 0; i <a.length; i++)
	        {
	        	
	        	int numOfSwaps = 0;
	        	
	        	for(int j = 0; j< a.length-1; j++)
	        	{
	        		if(a[j] > a[j+1])
	        		{
	        			int temp = a[j+1];
	        			a[j+1] = a[j];
	        			a[j] = temp;
	        			numOfSwaps++;
	        		}	        		
	        	}
	        	totalSwap = totalSwap+numOfSwaps;
	        }
	        
	        System.out.println("Array is sorted in " +totalSwap+ " swaps.");
	        System.out.println("First Element: " + a[0]);
	        System.out.println("Last Element: " + a[n-1]);
	        
	 }
}
