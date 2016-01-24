/**
 * Runs the classes, prompts the user for input, and prints the result to the console.
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */ 

import java.util.*;
public class TestHomework3 {
    public static void main(String[] args) {
        
        List<Homework3> al = new ArrayList<Homework3>();
        
        MyMath3 math = new MyMath3();
        MyEnglish3 english = new MyEnglish3();
        MyJava3 java = new MyJava3();
        MyScience3 science = new MyScience3();
        
        al.add(math);
        al.add(science);
        al.add(english);
        al.add(java);
       
        int p = 6;
        for (Homework3 inner : al)
        {
            inner.createAssignment(p);
            System.out.println(inner);
            p++;
        }
           if (math.compareTo(english) == 0 )

	       System.out.println("\nThe homework for math and english are the same number of pages.");

	    else

	       System.out.println("\nThe homework for math and english are not the same number of pages.");
    }
}