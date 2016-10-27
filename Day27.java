/**
 * 
 */
package HackerRank30Days;

/**
 * @author mkunaparaju
 *
 */
public class Day27 {
	 public static void main(String[] args) {
	        
	        System.out.println(5);
	        printTest(4, 2, new int[] {-1, -2, -3, -4});
	        printTest(4, 3, new int[] {-1, -2, -3, -4});
	        printTest(4, 2, new int[] {-1, 2, 3, 4});
	        printTest(5, 2, new int[] {-1, -2, -3, -4, 1});
	        printTest(7, 3, new int[] {-1, -2, 3, 4, 3, 4, 6});
	        
	    }
	    
	    static void printTest(int n, int k, int [] val){
	        System.out.println(n + " "+ k);
	        for(int i = 0; i<val.length; i++)
	        {
	            System.out.print(val[i] + " ");
	        }
	        System.out.println("");
	       
	    }
}
