/**
 * Class MyEnglish extends Homework
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyEnglish extends Homework
{
	MyEnglish()
	{
	}
	public void createAssignment(int pages) 
	{
		setPagesRead(pages);
		setTypeHomework("English");
	}
	public String toString() 
	{
		return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
	}
}