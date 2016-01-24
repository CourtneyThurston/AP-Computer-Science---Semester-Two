/**
 * Generates a list of prime numbers from 1 to the upper limit given by the user. Counts the number
 * of numbers generated.
 * 
 * @author C. Thurston 
 * @version 5/7/2014
 */

import java.util.Scanner;
public class PrimeNumber
{
	private boolean isValid;
	PrimeNumber(boolean isValid)
	{
		this.isValid = isValid;
	}
    public static void main(String args[]) 
    {
      System.out.println("Enter the upper limit for the prime numbers computation: ");
      int upperLimit = new Scanner(System.in).nextInt();
      int count = 0;
      for(int number = 2; number<=upperLimit; number++)
      {
          if(isPrime(number))
          {
              System.out.println(number);
              count++;
          }
      }
      System.out.println("Number of primes generated: " + count);
    }
    public static boolean isPrime(int number)
    {
        for(int i=2; i<number; i++)
        {
           if(number%i == 0)
           {
               return false; 
           }
        }
        return true; 
    }
}