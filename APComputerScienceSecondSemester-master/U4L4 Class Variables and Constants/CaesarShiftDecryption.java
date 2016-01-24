/**
 * Decodes Caesars Cipher to English.
 * 
 * @author C. Thurston
 * @version 5/6/2014
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CaesarShiftDecryption 
{
    public static String phrase[] = new String[26];
    public static void decryptionInstantiator()
    {
            try 
            {
                Scanner inFile = new Scanner(new File("Caesar.txt"));
                for(int i=0;i<26;i++)
                {
                    phrase[i] = inFile.nextLine();
                }
                inFile.close();
            } catch (FileNotFoundException e) 
            {
                System.out.println("There has been a FileNotFoundException. Please ensure the text file is in the proper directory.");;
            } catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("There has been an ArrayIndexOutOfBoundsException. Please try running the program again.");
            }
    }
    public String CaeserConverter(String inputString)
    {
        char characterKey[] = new char[inputString.length()];
        String base = inputString.toLowerCase();
        for(int i=0;i<inputString.length();i++)
        {
            characterKey[i] = base.charAt(0);
            base = base.substring(1);
        }
        for(int j=0;j<inputString.length();j++)
        {
            if(characterKey[j] == ' ')
            {
                System.out.print(" ");
            }
            else if(characterKey[j] == 'a')
            {
                System.out.print("x");
            }
            else if(characterKey[j] == 'b')
            {
                System.out.print("y");
            }
            else if(characterKey[j] == 'c')
            {
                System.out.print("z");
            }
            else
            {
                System.out.print((char)(characterKey[j] - 3));
            }
        }   
        return "";
    }
}