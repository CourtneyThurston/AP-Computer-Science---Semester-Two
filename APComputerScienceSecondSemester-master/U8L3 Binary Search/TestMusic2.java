/**
 * Searches the Music list by various qualities using binary search!
 * 
 * @author C. Thurston
 * @version 5/29/2014
 */

import java.util.ArrayList;
import java.util.Collections;
public class TestMusic2
{
    public static void sortTitles(ArrayList<Music2> music)
    {
       int y;
       Music2 temp = new Music2("","",0);
       
       for(int x = 1; x<music.size(); x++)
       {
            temp.equals(music.get(x));
            y=0;
            for( y = x; y > 0; y--)
            {    
                if(temp.getTitle().compareTo(music.get(y-1).getTitle()) < 0)
                    music.get(y).equals(music.get(y-1));    
                else
                    break;
            }
            music.get(y).equals(temp);
       }       
    }    
    public static void sortSingers(ArrayList<Music2> music)
    {
       int y;
       Music2 temp = new Music2("","",0);
       for(int x = 1; x<music.size(); x++)
       {
            temp.equals(music.get(x));
            y=0;
            for( y = x; y > 0; y--)
            {    
                if(temp.getSinger().compareTo(music.get(y-1).getSinger()) < 0)
                    music.get(y).equals(music.get(y-1));    
                else
                    break;
            }
            music.get(y).equals(temp);
       }       
    } 
    public static void sortYears(ArrayList<Music2> music)
    {
       int y;
       Music2 temp = new Music2("","",0);
       for(int x = 1; x<music.size(); x++)
       {
            temp.equals(music.get(x));
            y=0;
            for( y = x; y > 0; y--)
            {    
                if(temp.getYear() < music.get(y-1).getYear())
                    music.get(y).equals(music.get(y-1));    
                else
                    break;
            }
            music.get(y).equals(temp);
       }       
    } 
    public static void printMusic2(ArrayList<Music2> myMusic2)
    {
        for(Music2 a : myMusic2)
            System.out.println(a);
    }
    public static boolean searchTitle(ArrayList<Music2> music, String beginSearch)
    {   
        int begin = 0;
        int midpoint;
        int maximum = music.size();
        sortYears(music);
        while(begin < maximum)
        {
            midpoint = (begin+maximum)/2;
            if(music.get(midpoint).getTitle().compareTo(beginSearch) < 0)
                maximum = midpoint;
            else if(music.get(midpoint).getTitle().compareTo(beginSearch) > 0)
                begin  = midpoint+1;
            else
               return true;
        }
        return false;
    }
    public static String searchYear(ArrayList<Music2> music, int beginSearch)
    {
        String Music2ByYear = "";
        int begin = 0;
        int midpoint;
        int maximum = music.size();
        sortYears(music);
        while(begin < maximum)
        {
            midpoint = (begin+maximum)/2;
            if(music.get(midpoint).getYear() > beginSearch)
                maximum = midpoint;
            else if(music.get(midpoint).getYear() < beginSearch)
                begin  = midpoint+1;
            else
            {
                Music2ByYear += music.get(midpoint)+"\n"; 
                break;
            }
        }
        if(Music2ByYear == "")
            Music2ByYear = "Error: No listings found for that year.";
        return Music2ByYear;
    }
    public static String searchSinger(ArrayList<Music2> music, String beginSearch)
    {   
        String Music2ByArtist = "";
        int begin=0;
        int midpoint;
        int maximum = music.size();
        sortSingers(music);
        while(begin < maximum)
        {
            midpoint = (begin+maximum)/2;
            if(music.get(midpoint).getSinger().compareTo(beginSearch) > 0)
                maximum = midpoint;
            else if(music.get(midpoint).getSinger().compareTo(beginSearch) < 0)
                begin  = midpoint+1;
            else
            {
                Music2ByArtist += music.get(midpoint)+"\n";
                   break;
            }
        }
        if(Music2ByArtist == "")
            Music2ByArtist = "Error: No listings found for that singer.";
        return Music2ByArtist;
    }
    public static void main(String [] args)
    {
        ArrayList<Music2> myMusic2 = new ArrayList<Music2>();           
        myMusic2.add(new Music2("Pieces of You","Jewel",1994));
        myMusic2.add(new Music2("Jagged Little Pill","Alanis Morissette", 1995));
        myMusic2.add(new Music2("What if it's You","Reba McEntire",1995));
        myMusic2.add(new Music2("Misunderstood","Pink",2001));
        myMusic2.add(new Music2("Laundry Service","Shakira",2001));
        myMusic2.add(new Music2("Taking the Long Way","Dixie Chicks",2006));
        myMusic2.add(new Music2("Under My Skin","Avril Lavigne",2004));
        myMusic2.add(new Music2("Let Go","Avril Lavigne",2002));
        myMusic2.add(new Music2("Let It Go","Tim McGraw",2007));
        myMusic2.add(new Music2("White Flag","Dido",2004));
        
        System.out.println(searchTitle(myMusic2, "Misunderstood")+"\n");
        System.out.println(searchTitle(myMusic2, "Under Paid")+"\n");
        System.out.println(searchYear(myMusic2, 2005)+"\n");
        System.out.println(searchYear(myMusic2, 2006)+"\n");
        System.out.println(searchSinger(myMusic2, "Darth Maul")+"\n");
        System.out.println(searchSinger(myMusic2, "Dido")+"\n");
    }
}