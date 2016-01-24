/**
 * Terrain class and constructor!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
public class Terrain
{
	// instance variables 
	private double length, width;

	public Terrain(double l, double w)
	{
		//instance variables
		length = l;
		width = w;
	}


	public void terrainSize()
	{
		System.out.print("Land has dimensions " + (int)length + " (meters) by " + (int)width+" (meters)");
	}
}