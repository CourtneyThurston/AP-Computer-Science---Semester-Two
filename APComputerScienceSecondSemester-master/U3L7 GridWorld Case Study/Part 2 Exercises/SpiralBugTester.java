/**
 * Class drops flowers in a spiral pattern using the suggestion of the UnboundedGrid.
 * 
 * @author C. Thurston 
 * @version 4/29/2014
 */
import info.gridworld.actor.Actor; 
import info.gridworld.grid.UnboundedGrid; 
import info.gridworld.actor.ActorWorld; 
import info.gridworld.grid.Location; 
public class SpiralBugTester
{ 
    public static void main(String[] args) 
    { 
        UnboundedGrid grid = new UnboundedGrid<Actor>(); 
        ActorWorld world = new ActorWorld(grid); 
        SpiralBug sp = new SpiralBug(3); 
        world.add(new Location(4,6),sp); 
        world.show(); 
    } 
} 
