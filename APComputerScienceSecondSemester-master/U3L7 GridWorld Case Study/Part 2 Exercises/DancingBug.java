/**
 * Class DancingBug “dances” by making different turns before each move.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import info.gridworld.actor.Bug; 
public class DancingBug extends Bug 
{ 
    private int[] turnList; 
    private int currentStep; 
 
    public DancingBug(int[] turns) 
    { 
        turnList = turns; 
        currentStep = 0; 
    } 
    public void turn(int times) 
    { 
        for(int x = 1; x <= times; x++) 
        { 
            turn(); 
        } 
    } 
    public void act() 
    { 
        if(currentStep == turnList.length) 
        currentStep = 0; 
        turn (turnList[currentStep]); 
        currentStep++; 
        super.act(); 
    } 
} 

