/**
 * 
 */
package HackerRank30Days;

import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class Day9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		System.out.println(factorial(T));
    }
	
	public static int factorial(int n)
	{

		if(n == 0){	return 1;}
			if(n==1){	return 1;}
			
			return n*factorial(n-1);
		

	}
}
