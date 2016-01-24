/**
 * The TestMovie2 class tests and utilizes the methods found within the Movie2 class!
 * 
 * @author C. Thurston
 * @version 5/8/2014
 */

import java.util.*;
public class TestMovie2
{
    public static void main(String[] args)
    {
        Movie2[] theMovies = new Movie2[10];
        theMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        theMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
        theMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
        theMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
        theMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
        theMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
        theMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        theMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        theMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
        theMovies[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Before Sorting:");
        printMovies(theMovies);
        System.out.println();
        
        System.out.println("Sorted by Title - ascending:");
        Movie2[] titleSort = sortTitles(theMovies, 1);
        printMovies(titleSort);
        System.out.println();
        
        System.out.println("Sorted by Year - descending:");
        Movie2[] yearSort = sortYears(theMovies, 2);
        printMovies(yearSort);
        System.out.println();
        
        System.out.println("Sorted by Studio - ascending:");
        Movie2[] studioSort = sortStudios(theMovies, 1);
        printMovies(studioSort);
    }
    public static void printMovies(Movie2[] theMovies)
    {
        for(Movie2 movie : theMovies)
        {
            System.out.println(movie);
        }
    }
    public static Movie2[] sortTitles(Movie2[] theMovies, int parameter)
    {
        Movie2[] titleSort = new Movie2[theMovies.length];
        if(parameter == 1)
        {            
            for(int x = 0; x < theMovies.length; x++)
            {   
                String title = theMovies[x].getTitle();
                int index = 0;
                int counter = x;
                while(counter > 0 && index == 0)
                {
                    if(title.compareTo(titleSort[counter - 1].getTitle()) >= 1)
                    {
                        index = counter;
                    }
                    else
                    {
                        titleSort[counter] = titleSort[counter - 1];
                    }
                    counter --;
                }
                titleSort[index] = theMovies[x];
            }
        }
        else
        {
            for(int x = theMovies.length - 1; x > -1; x--)
            {
                String title = theMovies[x].getTitle();
                int index = theMovies.length - 1;
                int counter = x;
                while(counter < theMovies.length - 1 && index == theMovies.length - 1)
                {
                    if(title.compareTo(titleSort[counter + 1].getTitle()) >= 1)
                    {
                        index = counter;
                    }
                    else
                    {
                        titleSort[counter] = titleSort[counter + 1];
                    }
                    counter ++;
                }
                titleSort[index] = theMovies[x];
            }
        }
        return titleSort;
    }
    public static Movie2[] sortYears(Movie2[] theMovies, int parameter)
    {
        Movie2[] yearSort = new Movie2[theMovies.length];
        if(parameter == 1)
        {            
            for(int x = 0; x < theMovies.length; x++)
            {   
                int year = theMovies[x].getYear();
                int index = 0;
                int counter = x;
                while(counter > 0 && index == 0)
                {
                    if(year > yearSort[counter - 1].getYear())
                    {
                        index = counter;
                    }
                    else
                    {
                        yearSort[counter] = yearSort[counter - 1];
                    }
                    counter --;
                }
                yearSort[index] = theMovies[x];
            }
        }
        else
        {
            for(int x = theMovies.length - 1; x > -1; x--)
            {
                int year = theMovies[x].getYear();
                int index = theMovies.length - 1;
                int counter = x;
                while(counter < theMovies.length - 1 && index == theMovies.length - 1)
                {
                    if(year > yearSort[counter + 1].getYear())
                    {
                        index = counter;
                    }
                    else
                    {
                        yearSort[counter] = yearSort[counter + 1];
                    }
                    counter ++;
                }
                yearSort[index] = theMovies[x];
            }
        }
        return yearSort;
    }
    public static Movie2[] sortStudios(Movie2[] theMovies, int parameter)
    {
        Movie2[] studioSort = new Movie2[theMovies.length];
        if(parameter == 1)
        {            
            for(int x = 0; x < theMovies.length; x++)
            {   
                String studio = theMovies[x].getStudio();
                int index = 0;
                int counter = x;
                while(counter > 0 && index == 0)
                {
                    if(studio.compareTo(studioSort[counter - 1].getStudio()) >= 1)
                    {
                        index = counter;
                    }
                    else
                    {
                        studioSort[counter] = studioSort[counter - 1];
                    }
                    counter --;
                }
                studioSort[index] = theMovies[x];
            }
        }
        else
        {
            for(int x = theMovies.length - 1; x > -1; x--)
            {
                String studio = theMovies[x].getStudio();
                int index = theMovies.length - 1;
                int counter = x;
                while(counter < theMovies.length - 1 && index == theMovies.length - 1)
                {
                    if(studio.compareTo(studioSort[counter + 1].getStudio()) >= 1)
                    {
                        index = counter;
                    }
                    else
                    {
                        studioSort[counter] = studioSort[counter + 1];
                    }
                    counter ++;
                }
                studioSort[index] = theMovies[x];
            }
        }
        return studioSort;
    }
}
