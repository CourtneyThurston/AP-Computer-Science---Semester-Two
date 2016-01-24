/**
 * Class MyScience3 extends Homework3
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class MyScience3 extends Homework3
{
    int pages;
    public MyScience3()
    {
        super();
    }
    public void createAssignment(int p)
    {
        typeHomework = "Science";
        pages = p;
    }
    public String toString()
    {
        return typeHomework + " - must read " + pages + " pages";
    }
    public int returnPages()
    {
        return pages;
    }
    public int compareTo(Homework3 a)
    {
        if(pages==a.returnPages())
        {
            return 0;
        }
        else
            return 1;
    }
}