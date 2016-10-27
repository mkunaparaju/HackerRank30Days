package HackerRank30Days;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day28 {

    public static void main(String[] args) {
      	Queue<String> name = new PriorityQueue();
    	Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if(isGmail(emailID))
            {
            	name.add(firstName);
            }      
        }
        while(!name.isEmpty())
        {
        	System.out.println(name.poll());
        }
        
    }
    
    static boolean isGmail(String id){
    	String pattern = ".*@gmail.com"; 	
    	//System.out.println(id);
    	return id.matches(pattern);
    }
}
