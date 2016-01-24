/**
 * Searches the Music list by various qualities using binary search
 * 
 * @author C. Thurston
 * @version 5/29/2014
 */

public class Music2
{
    private String title;
    private int year;
    private String singer;
    public Music2(String title, String singer, int year)
    {
        this.title = title;
        this.year = year;
        this.singer = singer;
    }
    public String getTitle() 
    {
        return this.title; 
    }
    public int getYear() 
    { 
        return this.year; 
    }
    public String getSinger() 
    { 
        return this.singer; 
    }
    public Music2 equals(Music2 a)
    {
        this.title = a.getTitle();
        this.year = a.getYear();
        this.singer = a.getSinger();
        return this;
    }
    public String toString()
    {
        return title+", "+year+", "+singer;
    }
}