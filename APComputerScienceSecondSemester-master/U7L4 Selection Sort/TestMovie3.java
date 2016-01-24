/**
 * The TestMovie3 class tests and utilizes the methods found within the Movie class!
 * 
 * @author C. Thurston
 * @version 5/8/2014
 */

import java.util.ArrayList;
import java.util.Collections;
public class TestMovie3
{
    public static void printMovies(ArrayList<Movie> movies)
    {
        for(Movie a : movies)
            System.out.println(a);
        System.out.println();    
    }
    public static void sortTitles(ArrayList<Movie> movies, int direction)
    {
        Movie temp = new Movie("","",0);
        int index;
        
        switch(direction)
        {
            case 2:
                for(int x = movies.size()-1; x>0; x--)
                {    
                    index =0;
                    for(int y = x+1; y < movies.size(); y++)
                    {
                        if(movies.get(y).getTitle().compareTo(movies.get(index).getTitle()) > 0)
                            index = y;
                    }
                    
                    if(index != x)
                        Collections.swap(movies,x,index);
                } 
        
            break;
            case 1:
                for(int x = movies.size()-1; x>0; x--)
                {    
                    index =0;
                    for(int y =0; y < x; y++)
                    {
                        if(movies.get(y).getTitle().compareTo(movies.get(index).getTitle()) < 0)               
                            index = y;
                    }
                    
                    temp.equals(movies.get(x));
                    movies.get(x).equals(movies.get(index));
                    movies.get(index).equals(temp);
                }
            break;
        }
    }
    
    public static void sortStudios(ArrayList<Movie> movies, int direction)
    {
        Movie temp = new Movie("","",0);
        int index;
        
        switch(direction)
        {
            case 1:
                for(int x = movies.size()-1; x>0; x--)
                {    
                    index =0;
                    for(int y =0; y < x; y++)
                    {
                        if(movies.get(y).getStudio().compareTo(movies.get(index).getStudio()) > 0)
                            index = y;
                    }
                    
                    temp.equals(movies.get(x));
                    movies.get(x).equals(movies.get(index));
                    movies.get(index).equals(temp);
                } 
        
            break;
            case 2: 
                for(int x = movies.size()-1; x>0; x--)
                {    
                    index =0;
                    for(int y =0; y < x; y++)
                    {
                        if(movies.get(y).getStudio().compareTo(movies.get(index).getStudio()) < 0)               
                            index = y;
                    }
                    
                    temp.equals(movies.get(x));
                    movies.get(x).equals(movies.get(index));
                    movies.get(index).equals(temp);
                }
            break;
        }
    }
    
    public static void sortYears(ArrayList<Movie> movies, int direction)
    {
        Movie temp = new Movie("","",0);
        int index;
        
        switch(direction)
        {
            case 2:
                for(int x = movies.size()-1; x>0; x--)
                {    
                    index =0;
                    for(int y =1; y < x; y++)
                    {
                        if(movies.get(y).getYear() < movies.get(index).getYear())
                            index = y;
                    }
                    
                    if(index != x)
                        Collections.swap(movies,x,index);
                } 
        
            break;
            case 1:
                for(int x = movies.size()-1; x>0; x--)
                {    
                    index =0;
                    for(int y =1; y < x; y++)
                    {
                        if(movies.get(y).getYear() > movies.get(index).getYear())               
                            index = y;
                    }
                    
                    if(index != x)
                        Collections.swap(movies,x,index);
                }
            break;
        }
    }
    public static void main(String [] args)
    {
        ArrayList<Movie> myMovies = new ArrayList<Movie>();
        
        myMovies.add(new Movie("The Muppets Take Manhattan","Columbia Tristar",2001));
        myMovies.add(new Movie("Mulan Special Edition","Disney",2004));
        myMovies.add(new Movie("Shrek 2","Dreamworks",2004));
        myMovies.add(new Movie("The Incredibles","Pizar",2004));
        myMovies.add(new Movie("Nanny McPhee","Universal",2006));
        myMovies.add(new Movie("The Curse of the Were-Rabbit","Aardman",2006));
        myMovies.add(new Movie("Ice Age","20th Century Fox",2002));
        myMovies.add(new Movie("Lilo & Stich","Disney",2002));
        myMovies.add(new Movie("Robots","20th Century Fox",2005));
        myMovies.add(new Movie("Monsters Inc.","Pixar",2001));
        
        System.out.println("Before Sorting:");
        printMovies(myMovies);
        
        System.out.println("Sorted by Title - descending:");
        sortTitles(myMovies,2);
        printMovies(myMovies);
        
        System.out.println("Sorted by Year - descending:");
        sortYears(myMovies,2);
        printMovies(myMovies); 
        
        System.out.println("Sorted by Studios - ascending:");
        sortStudios(myMovies,1);
        printMovies(myMovies);
    }
}