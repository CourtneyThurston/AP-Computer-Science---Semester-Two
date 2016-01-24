
/**
 * Question #4 from U2L5 AP CS B
 * 
 * @author C. Thurston
 * @version 4/16/2014
 */
public class QuestionFour
{
    private static int f(int x) {
        if (x <= 20) {
            return f(x*2) - 4;
        } else  {
            return -100;
        }
    }   

    public static void main(String[] args) {
        System.out.println(f(500));
    }
}
