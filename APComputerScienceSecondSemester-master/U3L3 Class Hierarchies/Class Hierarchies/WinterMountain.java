/**
 * WinterMountain class and constructor!
 * 
 * @author C. Thurston
 * @version 5/1/2014
 */
public class WinterMountain extends Mountain
{
	private double temperature;
	WinterMountain(double l, double w, int mountains, double temp){
		super(l, w, mountains);
		temperature = temp;
	}
	public void getTemperature()
	{
		System.out.print(" at "+temperature+" degrees celsius");
	}
}