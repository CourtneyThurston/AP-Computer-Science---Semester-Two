/**
 * Establishes the Triangle class and constructor!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
public class Triangle extends IsoscelesTriangle
{
	private double sideC;
	/**
	 * Constructor for objects of class Triangle
	 */
	public Triangle(double A, double B, double C)
	{
		super(A,B);
		sideC = C;
	}
	public double getC()
	{
		return sideC;
	}
}