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
class Difference {

	/**
	 * @param a
	 */
	private int[] elements;
  	public int maximumDifference = 0;
  	
	public Difference(int[] a) {
		elements = a;
	}
	
	public void computeDifference() {
	for (int i =0; i <elements.length; i++)
	{
		for(int j =1; j< elements.length; j++)
		{
			int diff = Math.abs(elements[i] - elements[j]);
			if(diff >= maximumDifference)
			{
				maximumDifference = diff;
			}				
		}
	}
		
	}


}

public class Day14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
