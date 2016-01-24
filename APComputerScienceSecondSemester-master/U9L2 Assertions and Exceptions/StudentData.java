/**
 * Establishes the methods needed by the Tester class.
 * 
 * @author C. Thurston
 * @version 5/29/2014
 */

public class StudentData {
	private String firstName;
	private String lastName;
	private double[] testScore;
	private char finalGrade;
	public StudentData(String FN, String LN, double[] TS, char FG) 
	{
		firstName = FN;
		lastName = LN;
		testScore = TS;
		finalGrade = FG;
	}
	public void setFN(String FN) {firstName = FN;};
	public void setLN(String LN) {lastName = LN;}
	public void setTS(double[] TS) {testScore = TS;}
	public void setFG(char FG) {finalGrade = FG;}
	public String getFN() {return firstName;};
	public String getLN() {return lastName;}
	public String getTS() {
		return ""+testScore[0]+"   "+testScore[1]+"   "+testScore[3]+"   "+testScore[4];
	}
	public char getFG() {return finalGrade;}
}