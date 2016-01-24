/**
 * Class MyEnglish3 extends Homework3
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyScience extends Homework
{
	MyScience() 
	{
		super();
	}
	public void createAssignment(int pages) 
	{
		setPagesRead(pages);
		setTypeHomework("Science");
	}
	public String toString() 
	{
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}