/**
 * Question #2 from U2L5 AP CS B
 * 
 * @author C. Thurston
 * @version 4/16/2014
 */
public class QuestionTwo
{
    private static int f(int x) {
        if (x > 25) {
            return f(x/12+5) - 3;
        } else  {
            return 20;
        }
    }   

    public static void main(String[] args) {
        System.out.println(f(30));
    }
}