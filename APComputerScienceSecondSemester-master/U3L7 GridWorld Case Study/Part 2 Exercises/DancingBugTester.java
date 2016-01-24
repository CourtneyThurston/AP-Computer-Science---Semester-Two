/**
 * Creates an array and passes it as a parameter to the DancingBug constructor.
 * 
 * @author C. Thurston
 * @version 4/29/2014
 */
import info.gridworld.actor.ActorWorld; 
import info.gridworld.grid.Location; 
import java.awt.Color; 
public class DancingBugTester
{ 
    public static void main(String[] args) 
    { 
        ActorWorld world = new ActorWorld(); 
        int[] turns = {2,1,3,2}; 
        DancingBug ballerina = new DancingBug(turns); 
        ballerina.setColor(Color.RED); 
        world.add(new Location(9, 9), ballerina); 
        world.show(); 
    } 
} 
