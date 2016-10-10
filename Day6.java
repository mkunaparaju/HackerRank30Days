/**
 * 
 */
package HackerRank30Days;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) 
    {
       	Scanner sc = new Scanner(System.in);
		int numOfWords = sc.nextInt();
		for (int i = 0; i < numOfWords; i++) 
		{
			String word = sc.next();
			String even = "";
			String odd = "";
			for(int j = 0; j<word.length();j++)
			{
				if(j%2 == 0)
				{
					even = even + word.charAt(j);				
				}
				else
				{
					odd = odd + word.charAt(j);
				}
			}
			System.out.println(even + " " + odd);
		}
	}
}
