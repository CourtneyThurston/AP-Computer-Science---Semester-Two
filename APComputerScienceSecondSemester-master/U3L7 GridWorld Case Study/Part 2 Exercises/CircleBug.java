/**
 * Class CircleBug is identical to BoxBug, except that in the act method the turn method is called once instead
 * of twice. This produces an octagon path.
 * 
 * @author C. Thurston
 * @version 4/29/2014
 */
import info.gridworld.actor.Bug; 
public class CircleBug extends Bug 
{ 
    private int steps; 
    private int sideLength; 
    public CircleBug(int n) 
    { 
        sideLength = n; 
    } 
    public void act() 
    { 
        if (steps < sideLength && canMove()) 
        { 
            move(); 
            steps++; 
        } 
        else 
        { 
            turn(); 
            steps = 0; 
        } 
    } 
} 
