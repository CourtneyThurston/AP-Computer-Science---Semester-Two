/**
 * Cube3 demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Cube3{
	private int length,width,height;
	Cube3(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public String toString()
	{
	    return "The Cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
}