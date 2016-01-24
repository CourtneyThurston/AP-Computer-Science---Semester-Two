/**
 * Abstract class Homework which will be extended by Math/Science/English/Java classes.
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public abstract class Homework 
{
	private int pagesRead = 0;
	private String typeHomework = "null";
	Homework()
	{
	}
	public abstract void createAssignment(int pages);
	public String getTypeHomework() 
	{
		return typeHomework;
	}
	public void setTypeHomework(String typeHomework) 
	{
		this.typeHomework = typeHomework;
	}
	public int getPagesRead() 
	{
		return pagesRead;
	}
	public void setPagesRead(int pagesRead) 
	{
		this.pagesRead = pagesRead;
	}
}