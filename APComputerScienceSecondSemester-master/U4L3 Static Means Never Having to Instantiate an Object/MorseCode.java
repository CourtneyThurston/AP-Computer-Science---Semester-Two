/**
 * Converts string into Morse Code 
 * 
 * @author C. Thurston
 * @version 5/6/2014
 */ 

import java.util.*;
import java.io.File;
import java.io.IOException;
public class MorseCode 
{
    private static String[] morse; 
    private static String sentence;
    private static String Newsentence;
    public MorseCode(String p)
    {
        morse = new String[36];
        sentence = p;
        Newsentence = "";
    }
    public static String[] read() throws IOException
    {
        Scanner in = new Scanner(new File("morsecode.txt"));
        String a = sentence;
        int i = 0;
        while(in.hasNext())
        {
            String b = in.next();
            morse[i] = b;
            i++;
        }
        return morse;
    }
    public static void Convert()
    {
      char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                        'n','o','p','q','r','s','t','u','v','w','x','y','z'};
      char[] num = {'0','1','2','3','4','5','6','7','8','9'};
      int i = 0;
      int a = 0;
      char l;
      int b = 0;
      sentence  = sentence.toLowerCase();
      for(i = 0; i < sentence.length(); i++)
      {  
        l = sentence.charAt(i);
        for ( a = 0 ; a < alpha.length ; a++ )
        {
               if ( l == alpha[a] )
                   {
                     Newsentence+= morse[a];
                    }
        }
      }
      for(i = 0; i < sentence.length(); i++)
      {  
        b = sentence.charAt(i);
        for ( a = 0 ; a < num.length ; a++ )
        {
               if ( b == num[a] )
                   {
                     Newsentence+= "    " + morse[a+25];
                  }
        }
      }
    }
    public static String getNewSentence()
    {
        return Newsentence;
    }
}