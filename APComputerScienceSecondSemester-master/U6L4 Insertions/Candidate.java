/**
 * Class Candidate establishes the methods for TestCandidate5
 * 
 * @author C. Thurston
 * @version 5/17/2014
 */
public class Candidate
{
    private String name;
    private int numVotes;
    Candidate(int nv, String n)
    {
        name = n;
        numVotes = nv;
    }
    public String getName()
    {
        return name;
    }
    public int getVotes()
    {
        return numVotes;
    }
    public String setName(String replace)
    {
        return name = replace;
    }
    public int setVote(int replace)
    {
        return numVotes = replace;
    }
    public String toString()
    {
        return name + " recieved " + numVotes + " votes.";
    }
}