/**
 * box demo taken from the lessons per instruction.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box extends Rectangle
{
	// instance variables 
	public int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return this.height;
	}

}
