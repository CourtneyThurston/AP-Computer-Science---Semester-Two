/**
 * Class MyMath2 extends Homework2
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyMath2 extends Homework2 implements Processing
{
    MyMath2() 
    {
        super();
    }
    public void createAssignment(int pages) 
    {
        setPagesRead(pages);
        setTypeHomework("Math");
    }
    public void doReading() 
    {
        this.pagesRead -= 2;  // subtract 2 from the current page count.
    }
    public String toString() 
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
}