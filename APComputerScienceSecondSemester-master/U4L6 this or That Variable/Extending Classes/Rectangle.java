
/**
 * rectangle demo taken from the lessons per instruction.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Rectangle
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return this.length;
	}
	public int getWidth()
	{
	    return this.width;
	}
	   
}