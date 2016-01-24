
/**
 * Box3 demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		super(l, w);
		height = h;
	}

	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
	}

}