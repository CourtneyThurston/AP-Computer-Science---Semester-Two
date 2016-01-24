/**
 * Implements polymorphism techniques to complete the assignment!
 * 
 * @author C. Thurston
 * @version 5/5/2014
 */
import java.util.ArrayList;
public class TestPoly2
{
	public static void showCenter(Circle2 circle)
    {
        System.out.println("For " + circle + ", center is at " + circle.center() + ".");
    }
    public static void main(String args[]) 
    {
        ArrayList<Circle2> polymorphism = new ArrayList<Circle2>();
        polymorphism.add( new Circle2(2,4,1) );
        polymorphism.add( new Cylinder2(10,15,1,1) );
        polymorphism.add( new Oval2(25,10,1,2) );
        polymorphism.add( new OvalCylinder2(40,10,1,2,1) );
        for ( Circle2 circ : polymorphism)
            showCenter(circ);
    }
}
