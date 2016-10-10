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

public class Day1 {

	public static void main(String [] args)
	{
		 int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in); 
	        
	        int i2 = 0;
	        double d2 = 0.0;
	        String s2 = "";
	        
	        
	        	i2 = Integer.parseInt(scan.nextLine());
	        	d2 = Double.parseDouble(scan.nextLine());
	        	s2 = scan.nextLine();
	        
	        	int isum = i+i2;
                double dsum = d+d2;
                String finalString = s + s2;
            
                System.out.println(isum);
                System.out.println(dsum);
                System.out.println(finalString);
	 scan.close();      
	}
}
