/**
 * Class TestCandidate5 tests class Candidate and prints the output to the console!
 * 
 * @author C. Thurston
 * @version 5/17/2014
 */
public class TestCandidate5
{
    public static int getTotal(Candidate[] candidates)
    {
        int total = 0;
        for(int i = 0; i < candidates.length; i++)

            if(candidates[i] == null)
            {
            }
            else
            {
                total = candidates[i].getVotes() + total;
            }
        return total;       
    }
    public static void printVotes(Candidate[] candidates) 
    {
        System.out.println();
        for(int i = 0; i < candidates.length; i++)
        System.out.println(candidates[i]);
    }
    public static void printResults(Candidate[] candidates) 
    {
        double total = getTotal(candidates);
        System.out.printf("%8s , %8s, %8s",
               "Name", "Votes", "Percent");
        System.out.println("");
        for(int i = 0; i < candidates.length; i++)
        {
        if(candidates[i] == null)
        {
        }
        else
        System.out.printf("%8s , %8d, %8f", candidates[i].getName(),
            candidates[i].getVotes(), ((candidates[i].getVotes() / total) * 100));
        System.out.println("");
        }
    }
    public static void changeName(Candidate[] candidates, String find, String replace) 
    { 
        for(int i = 0; i < candidates.length; i++) 
            if (candidates[i].getName().equals(find)) 
                candidates[i].setName(replace); 
    }
    public static void changeVote(Candidate[] candidates, int find, int replace) 
    { 
        for(int i = 0; i < candidates.length; i++) 
        if (candidates[i].getVotes() == find) 
            candidates[i].setVote(replace); 
    }
    public static void insertPosition(Candidate[] candidates, int location, String addN, int addS) 
    {          
            for(int i = candidates.length - 1; i > location; i--)
            candidates[i] = candidates[i-1];
            candidates[location] = new Candidate(addS, addN);
    }
    public static void insertCandidate(Candidate[] candidates, String find, String addN, int addS) 
    {
        int location = 0;
    
        for(int i = 0; i < candidates.length; i++)
        if (candidates[i].getName().equals(find))
               location = i;
           
        for(int i = candidates.length - 1; i > location; i--)
               candidates[i] = candidates[i-1];
               candidates[location] = new Candidate(addS, addN);
    }
    public static void deleteByLoc(Candidate[] candidates, int location) 
    {          
        if ((location > 0) && (location < candidates.length))
        {
            for(int i = location; i < candidates.length -1; i++)
                candidates[i] = candidates[i + 1];
                candidates[candidates.length-1] = null;
        }
    }
    public static void deleteByName(Candidate[] candidates, String find) 
    {
      int location = 0;
      int i;
        for(i = 0; i < candidates.length; i++)
        if ((candidates[i] != null) && (candidates[i].getName().equals(find)))
        { 
            location = i;
            break;
        }
        else if (candidates[i] == null)
        {
        location = -1;
        break;
      }
      if ((i != candidates.length) && (location >= 0))       
      {
        for(i = location; i < candidates.length -1; i++)
            candidates[i] = candidates[i + 1];
            candidates[candidates.length-1] = null;
        }
    }  
    public static void main(String[] args)
    {
        Candidate[] candidates = new Candidate[10];
    
        candidates[0] = new Candidate(5000, "John Smith");
        candidates[1] = new Candidate(4000, "Mary Miller");        
        candidates[2] = new Candidate(6000, "Michael Duffy");
        candidates[3] = new Candidate(2500, "Tim Robinson");
        candidates[4] = new Candidate(1800, "Joe Ashtony"); 
        candidates[5] = new Candidate(3000, "Mickey Jones");
        candidates[6] = new Candidate(2000, "Rebecca Morgan");        
        candidates[7] = new Candidate(8000, "Kathleen Turner");
        candidates[8] = new Candidate(500, "Tory Parker");
        candidates[9] = new Candidate(10000, "Ashton Davis");    
    
        System.out.println("Results per canidate:");
        System.out.println("---------------------");
        System.out.println("");
        printVotes(candidates);
        System.out.println("");
        printResults(candidates);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(candidates));
    
        System.out.println("");
    
        changeName(candidates, "Michael Duffy", "John Elmos");
    
        System.out.println("Changing Michael Duffy to John Elmos:");
        System.out.println("---------------------");
        System.out.println("");
        printResults(candidates);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(candidates));
    
        changeVote(candidates, 3000, 2500);
    
        System.out.println("");
        System.out.println("Changing Mickey Jones vote to 2500:");
        System.out.println("---------------------");
        System.out.println("");
        printResults(candidates);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(candidates));
    
        //changeName(election, "Kathleen Turner", "John Kennedy");
        //changeVote(election, 2500, 8000);
    
        //System.out.println("");
        //System.out.println("Replacing Kathleen Turner with John Kennedy:");
        //System.out.println("---------------------");
        //System.out.println("");
        //printResults(election);
        //System.out.println("");
        //System.out.println("Total number of votes in election: " + getTotal(election));
    
        insertPosition(candidates, 5, "Mickey Duck", 14000);
    
        System.out.println("");
        System.out.println("Adding Mickey Duck, 14000 votes:");
        System.out.println("---------------------");
        System.out.println("");
        printResults(candidates);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(candidates));
    
        insertCandidate(candidates, "Kathleen Turner", "Donald Mouse", 100);
    
        System.out.println("");
        System.out.println("Adding Donald Mouse, 100 votes:");
        System.out.println("---------------------");
        System.out.println("");
        printResults(candidates);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(candidates));
    
        deleteByLoc(candidates, 6);
    
        System.out.println("");
        System.out.println("Deleting Location 6:");
        System.out.println("---------------------");
        System.out.println("");
        printResults(candidates);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(candidates));
    
        deleteByName(candidates, "Kathleen Turner");
    
        System.out.println("");
        System.out.println("Deleting Kathleen Turner:");
        System.out.println("---------------------");
        System.out.println("");
        printResults(candidates);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(candidates));
    }
}