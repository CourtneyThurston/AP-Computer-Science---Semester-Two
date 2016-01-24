/**
 * Tests the Candidate class!
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

import java.util.ArrayList;
class TestCandidate 
{
    public static void main(String[] args)
    {
        Candidate[] candidates =  
        {  
        new Candidate("John Smith", 5000),  
        new Candidate("Mary Miller", 4000),  
        new Candidate("Michael Duffy", 6000),  
        new Candidate("Tim Robinson", 2500),  
        new Candidate("Joe Ashtony", 1800)  
        };   
        
        System.out.println("Results per candidate:");
        System.out.println("----------------------");
        System.out.println("");
        printVotes(candidates);
        System.out.println("");
        printResults(candidates);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(candidates));
    }
    public static void printResults(Candidate[] list) 
    {
        double total = getTotal(list);
        System.out.printf("%8s , %8s, %8s", "Name", "Votes", "Percent");
        System.out.println("");
        for(int i = 0; i < list.length; i++)
        {
           System.out.printf("%8s , %8d, %8f", list[i].getName(), list[i].getVotes(), ((list[i].getVotes() / total) * 100));
           System.out.println("");
        }
    }
    public static int getTotal(Candidate[] list) 
    {
        int total = 0;
        for(int i = 0; i < list.length; i++)
           total = list[i].getVotes() + total;
          
        return total;
    }
    public static void printVotes(Candidate[] list) 
    {
        System.out.println();
        for(int i = 0; i < list.length; i++)
           System.out.println(list[i]);
    }
}