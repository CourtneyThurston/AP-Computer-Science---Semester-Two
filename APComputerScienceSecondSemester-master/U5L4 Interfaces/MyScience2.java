/**
 * Class MyScience2 extends Homework2 and implements Processing
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyScience2 extends Homework2 implements Processing
{
	MyScience2() 
	{
		super();
	}
	public void createAssignment(int pages) 
	{
		setPagesRead(pages);
		setTypeHomework("Science");
	}
	public void doReading() 
    {
        this.pagesRead -= 3;  // subtract 3 from the current page count.
    }
	public String toString() 
	{
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}