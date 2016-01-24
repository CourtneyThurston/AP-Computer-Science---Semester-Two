/**
 * The Movie class establishes methods to be used in the tester class.
 * 
 * @author C. Thurston
 * @version 5/8/2014
 */

public class Movie
{
    private String _studio;
    private String _title;
    private int _year;
    public Movie(String title, String studio, int year)
    {
        _title = title;
        _studio = studio;
        _year = year;
    }
    public String getStudio() 
    { 
        return _studio; 
    }
    public String getTitle() 
    { 
        return _title; 
    }
    public int getYear() 
    { 
        return _year; 
    }
    public void setStudio(String value) 
    { 
        _studio = value; 
    }
    public void setTitle(String value) 
    {
        _title = value; 
    }
    public void setYear(int value) 
    {
        _year = value;
    }
    public void equals(Movie movie)
    {
        _studio = movie.getStudio();
        _title = movie.getTitle();
        _year = movie.getYear();
    }
    public String toString()
    {
        return _title+", "+_year+", "+_studio;
    }
}