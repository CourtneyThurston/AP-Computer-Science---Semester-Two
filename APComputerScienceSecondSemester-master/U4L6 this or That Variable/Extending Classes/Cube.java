/**
 * Establishes the Cube class, extending Box, and constructor!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
public class Cube extends Box
{
	private int length;
	public Cube(int l)
	{
		super(l, l, l);
		length = l;
	}
	public int getLength()
	{
		return this.length;
	}
}
