/**
 * Question #1 from U2L5 AP CS B
 * 
 * @author C. Thurston
 * @version 4/16/2014
 */
public class QuestionOne
{
    private static int f(int x) {
        if (x > 10) {
            return f(x-4) + 2;
        } else  {
            return -7;
        }
    }   

    public static void main(String[] args) {
        System.out.println(f(25));
    }
}