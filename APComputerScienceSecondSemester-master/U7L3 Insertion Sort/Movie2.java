/**
 * The Movie2 class establishes methods to be used in the tester class.
 * 
 * @author C. Thurston
 * @version 5/8/2014
 */

public class Movie2
{
    //instance variables
    private String title;
    private int year;
    private String studio;

    public Movie2(String title, int year, String studio)
    {
       this.title = title;
       this.year = year;
       this.studio = studio;
    }
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    public String getStudio()
    {
        return studio;
    }
    public String toString()
    {
        return title + "\t\t" + year + "       " + studio;
    }
}