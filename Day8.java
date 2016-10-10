/**
 * 
 */
package HackerRank30Days;
import java.util.*;
import java.io.*;
/**
 * @author mkunaparaju
 *
 */
public class Day8 {
	 public static void main(String []argh)
	 {

	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
			Map<String, Integer> pb = new HashMap<String, Integer>();	        
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            pb.put(name, phone);
	            
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            if(pb.containsKey(s))
	            {
	            	System.out.println(s+"="+pb.get(s));
	            }
	            else
	            {
	            	System.out.println("Not Found");
	            }

	        }
	        in.close();
	    }
}

