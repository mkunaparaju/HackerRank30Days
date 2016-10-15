/**
 * 
 */
package HackerRank30Days;
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
/**
 * @author mkunaparaju
 *
 */

class Calculator1 implements AdvancedArithmetic
{

	/* (non-Javadoc)
	 * @see HackerRank30Days.AdvancedArithmetic#divisorSum(int)
	 */
	@Override
	public int divisorSum(int n) {
		int count =0;
		for(int i =1; i<=n; i++)
		{
			if(n%i ==0)
			{
				count = count +i;			}
				
		}
		return count;
	}
	
}
public class Day19 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator1(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
