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
        MyEnglish2 eng = new MyEnglish2();
        MyJava2 jav = new MyJava2();
        MyMath2 mat = new MyMath2();
        MyScience2 sci = new MyScience2();
        
        System.out.println("Enter how many pages of English");
        int englishPages = in.nextInt();
        System.out.println("Enter how many pages of Java");
        int javaPages = in.nextInt();
        System.out.println("Enter how many pages of Math");
        int mathPages = in.nextInt();
        System.out.println("Enter how many pages of Science");
        int sciencePages = in.nextInt();
        
        System.out.println("Before reading:");
        eng.createAssignment(englishPages);
        System.out.println(eng.toString());
        System.out.println("After reading:");
        eng.doReading();
        System.out.println(eng.toString());
        
        System.out.println("Before reading:");
        jav.createAssignment(javaPages);
        System.out.println(jav.toString());
        System.out.println("After reading:");
        jav.doReading();
        System.out.println(jav.toString());
        
        System.out.println("Before reading:");
        mat.createAssignment(mathPages);
        System.out.println(mat.toString());
        System.out.println("After reading:");
        mat.doReading();
        System.out.println(mat.toString());
        
        System.out.println("Before reading:");
        sci.createAssignment(sciencePages);
        System.out.println(sci.toString());
        System.out.println("After reading:");
        sci.doReading();
        System.out.println(sci.toString());
    }
}