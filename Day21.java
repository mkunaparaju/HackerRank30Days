/**
 * 
 */
package HackerRank30Days;
import java.lang.reflect.Method;
/**
 * @author mkunaparaju
 *
 */
public class Day21 {
	 
	public static <T> void printArray(T[] arr)
	    {
	        for (T x : arr)
	        {
	            System.out.println(x);    
	        }
	    }
	 
	 public static void main(String args[]){
	        Integer[] intArray = { 1, 2, 3 };
	        String[] stringArray = { "Hello", "World" };
	        
	        printArray( intArray  );
	        printArray( stringArray );
	        
	        if(Day21.class.getDeclaredMethods().length > 2){
	            System.out.println("You should only have 1 method named printArray.");
	        }
	    }
	
	 
}
