/**
 * Runs the classes, prompts the user for input, and prints the result to the console.
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

import java.util.Scanner;
public class testHomework
{
	public static void main(String[]args)
	{
	    Scanner in = new Scanner(System.in);
		MyEnglish eng = new MyEnglish();
		MyJava jav = new MyJava();
		MyMath mat = new MyMath();
		MyScience sci = new MyScience();
		
		System.out.println("Enter how many pages of English");
		int englishPages = in.nextInt();
		System.out.println("Enter how many pages of Java");
		int javaPages = in.nextInt();
		System.out.println("Enter how many pages of Math");
		int mathPages = in.nextInt();
		System.out.println("Enter how many pages of Science");
		int sciencePages = in.nextInt();
		
		eng.createAssignment(englishPages);
		jav.createAssignment(javaPages);
		mat.createAssignment(mathPages);
		sci.createAssignment(sciencePages);
		System.out.println(eng.toString());
		System.out.println(jav.toString());
		System.out.println(mat.toString());
		System.out.println(sci.toString());
	}
}