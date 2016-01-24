/**
 * Mountain class and constructor!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
public class Mountain extends Terrain
{
	private double mountains;
	Mountain(double l, double w, int mountains)
	{
		super(l, w);
		this.mountains = mountains;
	}
	public void mountains()
	{
		System.out.print(" with "+mountains+" mountains");
	}
}