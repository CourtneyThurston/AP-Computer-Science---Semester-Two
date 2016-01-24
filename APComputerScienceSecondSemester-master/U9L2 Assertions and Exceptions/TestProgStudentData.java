/**
 * Prompts the user for input and enters this data into an ArrayList
 * 
 * @author C. Thurston
 * @version 5/29/2014
 */
import java.util.Scanner;
public class TestProgStudentData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        java.util.ArrayList<StudentData> info = new java.util.ArrayList<StudentData>();
        System.out.println("Enter how many people you will to enter into the list:");
        int numPeople = in.nextInt();
        for(int a=0;a<numPeople;a++) {
            try {
            double[] grade = new double[5];
            System.out.println("Enter their first grade:");
            grade[0]= in.nextDouble();
            System.out.println("Enter their second grade:");
            grade[1]=in.nextDouble();
            System.out.println("Enter their third grade:");
            grade[2]=in.nextDouble();
            System.out.println("Enter their fourth grade:");
            grade[3]=in.nextDouble();
            System.out.println("Enter their fifth grade:");
            grade[4]=in.nextDouble();
            in.nextLine();
            System.out.println("Enter their first name:");
            String firstName = in.nextLine();
            System.out.println("Enter their last name:");
            String lastName = in.nextLine();
            System.out.println("Enter their final grade:");
            String userInput = in.nextLine();
		    char finalGrade = userInput.charAt(0);
            info.add(new StudentData(firstName,lastName,grade,finalGrade));    
            }catch(IllegalArgumentException e){
                System.out.println("You didn't enter anything!");
            }
        }
        for(int b=0;b<numPeople;b++) {
            try {
                System.out.printf("%-10s %-10f %-3s      %-3f\n",info.get(b).getFN(),info.get(b).getLN(),info.get(b).getTS(),info.get(b).getFG());
                }catch(java.util.IllegalFormatConversionException e) {
                    System.out.println("\nInvalid conversion inside printf!\n");
                }
            try {
                System.out.printf("%-10s %-10s %-3s      %-3s\n",info.get(b).getFN(),info.get(b).getLN(),info.get(b).getTS(),info.get(b).getFG());
                }catch(java.util.IllegalFormatConversionException e) {
                    System.out.println("Invalid conversion inside printf!");
                }
        }
    }
}