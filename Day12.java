/**
 * 
 */
package HackerRank30Days;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Person1 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person1(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Day12 extends Person1{
	/**
	 * @param firstName
	 * @param lastName
	 * @param identification
	 */
	Day12(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String last = sc.next();
		int id = sc.nextInt();
		Day12 d = new Day12(first, last, id);
		//d.printPerson();
		int numScore = sc.nextInt();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		for (int i=0;i<numScore;i++)
		{
			scores.add(sc.nextInt());
		}
		sc.close();
		int totalScore=0;
		 
		for (int i = 0; i<numScore; i++)
		{
			totalScore = totalScore+ scores.get(i);
			
		}
		int avg = totalScore/numScore;
		String grade = "";
		if(avg >=90 && avg <=100)
		{
			grade = "O";
		}
		else if(avg >=80 && avg <90)
		{
			grade = "E";
		}
		else if(avg >=70 && avg <80)
		{
			grade = "A";
		}
		else if(avg >=55 && avg <70)
		{
			grade = "P";
		}
		else if(avg >=40 && avg <55)
		{
			grade = "D";
		}
		else if(avg <40)
		{
			grade = "T";
		}
		d.printPerson();
		System.out.println("Grade: " + grade);
	}
}