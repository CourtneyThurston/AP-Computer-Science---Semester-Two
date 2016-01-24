/**
 * Class MyJava3 extends Homework3
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyJava extends Homework
{
	MyJava() 
	{
	}
	public void createAssignment(int pages) 
	{
		setPagesRead(pages);
		setTypeHomework("Java");
	}
	public String toString() 
	{
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}