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
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

class MyBook extends Book
{

	/**
	 * @param t
	 * @param a
	 */
	String title;
	String author;
	int price;
	MyBook(String t, String a, int p) {
		super(t, a);
		title = t;
		author = a;
		price = p;
			
	}

	/* (non-Javadoc)
	 * @see HackerRank30Days.Book#display()
	 */
	@Override
	void display() {
		System.out.println("Title: "  + title);
		System.out.println("Author: "  + author);
		System.out.println("Price: "  + price);
		
	}
	
}


public class Day13
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}

