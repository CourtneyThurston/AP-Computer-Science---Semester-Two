/**
 * Tests Cube!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
import java.util.Scanner;
public class TestCube {
	public static void main(String[]args){		
	    Scanner in = new Scanner(System.in);

		System.out.println("Enter the length of one side of the cube:");
		int length = in.nextInt();
		Cube cubeA = new Cube(length);

		System.out.println("Cubes' dimensions are: "+cubeA.getLength()+" X "+cubeA.getLength()+" X "+cubeA.getLength());
	}
}