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
public class Day26 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int aDay = sc.nextInt();
		 int aMonth = sc.nextInt();
		 int aYear = sc.nextInt();
		 int eDay = sc.nextInt();
		 int eMonth = sc.nextInt();
		 int eYear = sc.nextInt();
		 
		 int Fine = 0;
		 if(aYear > eYear){ 
			 Fine =10000;
		}
		 else if(aYear < eYear) {
			 Fine =0;
		 }
		 else{
			 if(aMonth>eMonth){
				 Fine = 500*(aMonth-eMonth);
				
			}
			 else{
				if(aDay>eDay){ 
					Fine = 15*(aDay-eDay);
				}
			 }
		 }
		 System.out.println(Fine);
	    }
	 
	 
}
