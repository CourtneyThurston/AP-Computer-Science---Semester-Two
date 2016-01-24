/**
 * The Candidate class sets up the necessary methods!
 * 
 * @author C. Thurston
 * @version 5/7/2014
 */

public class Candidate
{
	private String name;
	private int numVotes;
	public Candidate(String n, int v)
	{
		name = n;
		numVotes = v;
    }
    public String getName()
	{
	return name;
	}
	public int getVotes()
	{
	return numVotes;
	}
    public String toString()
    {
        return name + " received " + numVotes + " votes.";
    }
}
