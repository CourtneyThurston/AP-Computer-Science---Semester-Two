/**
 * Music establishes the methods for TestMusic!
 * 
 * @author C. Thurston
 * @version 5/10/2014
 */

public class Music
{
    private String title, singer;
    private int year;
    public Music(String aTitle, int aYear, String aSinger)
    {
        title = aTitle;
        year = aYear;
        singer = aSinger;
    }
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    public String getSinger()
    {
        return singer;
    }
    public void setTitle(String t)

    {
        title = t;
    }
    public void setYear(int y)
    {
        year = y;
    }
    public void setSinger(String s)
    {
        singer = s;
    }
    public String toString()
    {
        return title + ", " + year + ", " + singer;
    }
}