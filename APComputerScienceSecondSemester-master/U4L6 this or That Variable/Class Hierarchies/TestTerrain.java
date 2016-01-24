/**
 * TestTerrain class to test Terrain!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
import java.util.Scanner;
public class TestTerrain 
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
	    // Winter Mountains
		System.out.println("Please input the length (in meters) of the Winter Mountains terrain:");
		double sideA = in.nextDouble();
		System.out.println("Please input the width (in meters) of the Winter Mountains terrain:");
		double sideB = in.nextDouble();
		System.out.println("Please input how many mountains there are in the Winter Mountains terrain:");
		int object1 = in.nextInt();
		System.out.println("Please enter the temperature (in celsius) of the Winter Mountains terrain:");
		double object2 = in.nextDouble();
		WinterMountain winter = new WinterMountain(sideA, sideB, object1, object2);
		System.out.println();
		
		// Mountains
		System.out.println("Please input the length (in meters) of the Mountains terrain:");
		sideA = in.nextDouble();
		System.out.println("Please input the width (in meters) of the Mountains terrain:");
		sideB = in.nextDouble();
		System.out.println("Please input how many mountains there are in the Mountains terrain:");
		object1 = in.nextInt();
		Mountain mountain = new Mountain(sideA, sideB, object1);
		System.out.println();
		
		// Forests
		System.out.println("Please input the length (in meters) of the Forests terrain:");
		sideA = in.nextDouble();
		System.out.println("Please input the width (in meters) of the Forests terrain:");
		sideB = in.nextDouble();
		System.out.println("Please input how many trees there are in the Forests terrain:");
		object1 = in.nextInt();
		Forest forest = new Forest(sideA, sideB, object1);
		System.out.println();
		
		forest.terrainSize();forest.getTrees();
		mountain.terrainSize();mountain.mountains();
		System.out.println();
		winter.terrainSize();winter.mountains();winter.getTemperature();
	}
}