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
public class Day25 {

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	           while(T-->0){
	               int ele=sc.nextInt();
	               System.out.println(isPrime(ele));
	           }
	        
	    }
	    
	    public static String isPrime(int in)
	    {
	    	for(int i =2; i <= in/2; i++)
	    	{
	    		if(in%i == 0)return "Not Prime";
	    				
	    	}
	    	
	    	
	        return "Prime";
	    }
	}