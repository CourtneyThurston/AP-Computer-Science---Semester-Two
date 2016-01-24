/**
 * Prompts the user for input.
 * 
 * @author C. Thurston
 * @version 5/5/2014
 */
import java.util.Scanner;
public class UserPrompt {
	public int userCube(){
		Scanner in = new Scanner(System.in);
	    System.out.println("Input length and press enter, next input width and press enter, finally height and press enter. This prompt will be repeated 3 times for each value.");
		return in.nextInt();
	}
	public int userRectangle(){
		Scanner in = new Scanner(System.in);
	    System.out.println("Input length and press enter, next input width and press enter. This prompt will be repeated 2 times for each value.");
		return in.nextInt();
	}
}