/**
 * Class MyEnglish2 extends Homework2 and implements Processing
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyEnglish2 extends Homework2 implements Processing
{
	MyEnglish2()
	{
	}
	public void createAssignment(int pages) 
	{
		setPagesRead(pages);
		setTypeHomework("English");
	}
	public void doReading() 
    {
        this.pagesRead -= 1;  // subtract 1 from the current page count.
    }
	public String toString() 
	{
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}