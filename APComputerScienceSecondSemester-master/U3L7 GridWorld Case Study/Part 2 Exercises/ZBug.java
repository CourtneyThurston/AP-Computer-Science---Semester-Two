/**
 * Class ZBug implements bugs that move in a “Z” pattern, starting in the top left corner.
 * 
 * @author C. Thurston
 * @version 4/29/2014
 */
import info.gridworld.actor.Bug; 
import info.gridworld.grid.Location; 
public class ZBug extends Bug 
{ 
    private int segmentLength; 
    private int steps; 
    private int segment; 
    public ZBug(int length) 
    { 
        setDirection(Location.EAST); 
        steps = 0; 
        segment = 1; 
        segmentLength = length; 
    } 
    public void act() 
    { 
        if (segment <= 3 && steps < segmentLength) 
        { 
            if (canMove()) 
            { 
                move(); 
                steps++; 
            } 
        } 
        else if (segment == 1) 
        { 
            setDirection(Location.SOUTHWEST); 
            steps = 0; 
            segment++; 
        } 
        else if (segment == 2) 
        { 
            setDirection(Location.EAST); 
            steps = 0; 
            segment++; 
        } 
    } 
} 
