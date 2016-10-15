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
public class Day16 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int value= 0;
        try{
        	value = Integer.parseInt(S);
        	System.out.println(value);
        }
        catch(Exception e){System.out.println("Bad String");}
    }
}
