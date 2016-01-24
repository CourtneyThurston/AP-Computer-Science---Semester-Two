/**
 * Abstract class Homework3 which will be extended by Math/Science/English/Java classes.
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public abstract class Homework3 implements Comparable<Homework3>
{
    int pagesRead;
    String typeHomework;
    public Homework3() 
    {
        pagesRead =0;
        typeHomework= "";
    }
    public abstract void createAssignment(int p);
    public abstract int returnPages();
    public abstract int compareTo(Homework3 a); 
}