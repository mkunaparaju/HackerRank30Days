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
public class day12New {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}


class Person2 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person2(String firstName, String lastName, int identification){
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

class Student extends Person2{
	/**
	 * @param firstName
	 * @param lastName
	 * @param identification
	 */
	private int[] testScores;
	Student(String firstName, String lastName, int identification, int[] ts) {
		super(firstName, lastName, identification);
		testScores = ts;		
	}
	public String calculate()
	{
		int avg =0;
		int totalScore = 0; 
		
		for (int i = 0; i<testScores.length; i++)
		{
			totalScore = testScores[i] + totalScore;
			avg = totalScore/testScores.length;
		}
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
		
		
		return grade;
	}
   
}