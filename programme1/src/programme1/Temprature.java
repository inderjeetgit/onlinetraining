package programme1;

public class Temprature {

	
	public static double convertToFarnheit(double celsius) {
		return celsius*9/5+32;
		
	}
	public static double convertToCelsius(double farnheit) {
		return (farnheit-32)*5/9;
	}

}
