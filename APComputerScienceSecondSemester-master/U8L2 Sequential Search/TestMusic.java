/**
 * Runs Music, searching for the terms given in the rubric and printing the output!
 * 
 * @author C. Thurston
 * @version 5/10/2014
 */

public class TestMusic
{
    public static Music[] myMusic = new Music[10];
    public TestMusic()
    {
    }
    public static void main(String[] args)
    {
        myMusic[0] = (new Music("Pieces of You",       1994, "Jewel"));
        myMusic[1] = (new Music("Jagged Little Pill",  1995, "Alanis Morissette"));
        myMusic[2] = (new Music("What If It's You",    1995, "Reba McEntire"));
        myMusic[3] = (new Music("Misunderstood",       2001, "Pink"));
        myMusic[4] = (new Music("Laundry Service",     2001, "Shakira"));
        myMusic[5] = (new Music("Taking the Long Way", 2006, "Dixie Chicks"));
        myMusic[6] = (new Music("Under My Skin",       2004, "Avril Lavigne"));
        myMusic[7] = (new Music("Let Go",              2002, "Avril Lavigne"));
        myMusic[8] = (new Music("Let It Go",           2007, "Tim McGraw"));
        myMusic[9] = (new Music("White Flag",          2004, "Dido"));

        System.out.println("Search - Title - Let Go");
        searchTitle(myMusic, "Let Go");
        System.out.println();
        System.out.println();
        System.out.println("Search - Title - Some Day");
        searchTitle(myMusic, "Some Day");
        System.out.println();
        System.out.println();
        System.out.println("Search - Year - 2001");
        searchYear(myMusic, 2001);
        System.out.println();
        System.out.println();
        System.out.println("Search - Year - 2003");
        searchYear(myMusic, 2003);
        System.out.println();
        System.out.println();
        System.out.println("Search - Singer - Avril Lavigne");
        searchSinger(myMusic, "Avril Lavigne");
        System.out.println();
        System.out.println();
        System.out.println("Search - Singer - Tony Curtis");
        searchSinger(myMusic, "Tony Curtis");     
    }
    public static void printMusic()
    {
        for(int i = 0; i < myMusic.length; i++)
        {
            System.out.println(myMusic);
        }
    }
    public static void searchTitle(Music[] array, String title)
    {
        int numOfRecords = 0;
        for(Music cd : myMusic)
        {
            if(cd.getTitle().equals(title))
            {
                System.out.println("We found " + title + " in the library:");
                System.out.println(cd);
                numOfRecords++;
            }
        }
        if(numOfRecords == 0)
        {
            System.out.println(title + " is not in the library.");
        }
    }
    public static void searchYear(Music[] array, int year)
    {
        int numOfRecords = 0;
        System.out.println("Find results:");
        for(Music cd : myMusic)
        {
            if(cd.getYear() == year)

            {
                System.out.println(cd);
                numOfRecords++;
            }
        }
        if(numOfRecords == 0)
        {
            System.out.println("There are no listings for " + year);
        }
        else
        {
            System.out.println("There were " + numOfRecords + " listings for " + year);
        }
    }
    public static void searchSinger(Music[] array, String singer)
    {
        int numOfRecords = 0;
        System.out.println("Find results:");
        for(Music cd : myMusic)
        {
            if(cd.getSinger().equals(singer))
            {
                System.out.println(cd);
                numOfRecords++;
            }
        }
        if(numOfRecords == 0)
        {
            System.out.println("There are no listings for " + singer);
        }
        else
        {
            System.out.println("There were " + numOfRecords + " listings for " + singer);
        }
    }
}