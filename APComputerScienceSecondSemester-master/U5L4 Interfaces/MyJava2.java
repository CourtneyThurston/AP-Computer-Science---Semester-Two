/**
 * Class MyJava2 extends Homework2 and implements Processing
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyJava2 extends Homework2 implements Processing
{
	MyJava2() 
	{
	}
	public void createAssignment(int pages) 
	{
		setPagesRead(pages);
		setTypeHomework("Java");
	}
	public void doReading() 
    {
        this.pagesRead -= 4;  // subtract 4 from the current page count.
    }
	public String toString() 
	{
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}