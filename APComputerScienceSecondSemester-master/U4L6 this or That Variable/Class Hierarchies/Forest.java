/**
 * Forest class and constructor!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
public class Forest extends Terrain
{
	private int trees;
	Forest(double l, double w, int trees)
	{
		super(l, w);
		this.trees = trees;
	}
	public void getTrees()
	{
		System.out.println(" and "+trees+" trees");
	}
}