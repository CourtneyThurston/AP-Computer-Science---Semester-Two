/**
 * Class MyMath3 extends Homework3
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyMath extends Homework
{
	MyMath() 
	{
		super();
	}
	public void createAssignment(int pages) 
	{
		setPagesRead(pages);
		setTypeHomework("Math");
	}
	public String toString() 
	{
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}