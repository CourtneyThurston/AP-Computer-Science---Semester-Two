/**
 * Tests MorseCode.
 * 
 * @author C. Thurston
 * @version 5/6/2014
 */ 

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class MorseCodeTester
{
   public static void main(String [] args) throws IOException
   { 
       Scanner in = new Scanner(System.in);
       System.out.println("Please input a sentence without punctuation that you would like encoded into Morse code:");
       String toMorse = in.nextLine();
       MorseCode m = new MorseCode(toMorse);
       m.read();
       m.Convert();
       System.out.println(m.getNewSentence());
   }
}