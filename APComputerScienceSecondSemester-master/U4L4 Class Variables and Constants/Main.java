/**
 * Prompts the user to choose from menu options and executes the chosen class.
 * 
 * @author C. Thurston
 * @version 5/6/2014
 */

import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        CaesarShiftEncryption.encryptionInstantiator();
        CaesarShiftEncryption convToCC = new CaesarShiftEncryption();
        CaesarShiftDecryption convFromCC = new CaesarShiftDecryption();
        
        System.out.println("Menu:");
        System.out.println("\n 1. Encode English to Caesers Cipher\n 2. Decode Caesers Cipher to English\n 3. Quit\n--\n");
        int input = in.nextInt();
        in.nextLine();
        
        System.out.println("--");
        if(input == 1)
        {
            System.out.println("Enter a string of English without punctuation to encode:");
            String toEncode = in.nextLine();
            convToCC.CaeserConverter(toEncode);
        }
        else if(input == 2)
        {
            System.out.println("Enter a string of Caesars Cipher without punctuation to decode:");
            String toDecode = in.nextLine();
            convFromCC.CaeserConverter(toDecode);
        }
        else if(input == 3)
        {
            System.exit(0);
        }
    }
}