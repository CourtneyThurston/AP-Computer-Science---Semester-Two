
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main (String[] args)
    {
        final int[] arr = { 5, 9, 17, 12, 2, 14 }; // This is my array
    int min;
    for (int i = 0; i < arr.length; i++) {
        // Assume first element is min
        min = i;
        for (int j = i + 1; j < 3; j++) {
            if (arr[j] < arr[min]) {
                min = j;

            }
        }
        if (min != i) {
            final int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(arr[i]);// I print the in ascending order
    }
    }
}
