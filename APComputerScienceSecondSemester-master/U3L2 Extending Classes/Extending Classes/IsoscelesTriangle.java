/**
 * Establishes the Isoceles Triangle class, extending EquilaterialTriangle, and constructor!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
public class IsoscelesTriangle extends EquilateralTriangle
{
	private double sideB;
	public IsoscelesTriangle(double A, double B) 
	{
		super(A);
		sideB = B;
	}
	public double getB()
	{
		return sideB;
	}
}
