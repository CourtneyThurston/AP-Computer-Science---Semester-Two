/**
 * Tests Triangle!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */

import java.util.Scanner;
public class TestTriangle 
{
	public static void main(String[]args)
	{		
	    Scanner in = new Scanner(System.in);
	    
	    // Defining Terms
		System.out.println("Side C->/_\\<-Side A");
		System.out.println("         ^\n       Side B\n");
		
		// Equilateral Triangle
		System.out.println("Equilateral Triangle Variables");
		System.out.println("Please input side A for the Equilateral Triangle:");
		double sideA = in.nextDouble();
		EquilateralTriangle triangleTwo = new EquilateralTriangle(sideA);
		
		// Isosceles Triangle
		System.out.println("Isosceles Triangle Variables");
		System.out.println("Please input side A for the Isosceles Triangle:");
		sideA = in.nextDouble();
		System.out.println("Please input side B for the Isosceles Triangle:");
		double sideB = in.nextDouble();
		IsoscelesTriangle triangleOne = new IsoscelesTriangle(sideA, sideB);
		
		// Scalene Triangle
		System.out.println("Scalene triangle values");
		System.out.println("Please input side A for the Scalene Triangle:");
		sideA = in.nextDouble();
		System.out.println("Please input side B for the Scalene Triangle:");
		sideB = in.nextDouble();
		System.out.println("Please input side C for the Scalene Triangle:");
		double sideC = in.nextDouble();
		Triangle triangleThree = new Triangle(sideA, sideB, sideC);
	
		System.out.println("Triangle has sides A = "+triangleThree.getA()+" B = "+triangleThree.getB()+" C = "+triangleThree.getC());
		System.out.println("Equilateral Triangle has sides A = "+triangleTwo.getA()+" B = "+triangleTwo.getA()+" C = "+triangleTwo.getA());
		System.out.println("Isosceles Triangle has sides A = "+triangleOne.getA()+" B = "+triangleOne.getA()+" C = "+triangleOne.getB());	
	}
}