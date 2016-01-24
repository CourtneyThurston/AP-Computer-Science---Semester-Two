/**
 * This program overrides the toString method!
 * 
 * @author C. Thurston
 * @version 5/5/2014
 */
public class Main {
	public static void main(String[]args){
		//User prompt
		UserPrompt g1 = new UserPrompt();
		
		//Cube 
		System.out.println("Enter the dimensions of the cube");
		int lengthCube = g1.userCube();
		int widthCube = g1.userCube();
		int heightCube = g1.userCube();
		Cube3 cubeMain = new Cube3(lengthCube, widthCube, heightCube);
		
		//Rectangle
		System.out.println("Enter the dimensions of the rectangle");
		int lengthRectangle = g1.userRectangle();
		int widthRectangle = g1.userRectangle();
		Rectangle3 rectangleMain = new Rectangle3(lengthRectangle,widthRectangle);
		
		//Box
		System.out.println("Enter the dimensions of the box");
		int lengthBox = g1.userCube();
		int widthBox = g1.userCube();
		int heightBox = g1.userCube();
		Box3 boxMain = new Box3(lengthBox,widthBox,heightBox);
		
		System.out.println(cubeMain.toString());
		System.out.println(rectangleMain.toString());
		System.out.println(boxMain.toString());
		
		if(cubeMain.getLength()==boxMain.getLength()&&cubeMain.getWidth()==boxMain.getWidth()&&cubeMain.getHeight()==boxMain.getHeight()){
			System.out.println("The Cube: " + lengthCube +" X " + widthCube + " X " + heightCube);
			System.out.println("The Box : " + lengthBox +" X " + widthBox + " X " + heightBox);
			System.out.println("The box and the cube are equal.");
		}
		else{
			System.out.println("The cube: " + lengthCube +" X " + widthCube + " X " + heightCube);
			System.out.println("The box : " + lengthBox +" X " + widthBox + " X " + heightBox);
			System.out.println("The box and the cube are not equal");
		}
	}
}