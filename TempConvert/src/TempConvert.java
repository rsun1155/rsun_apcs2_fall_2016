//Ryan Sun TempConvert September 1, 2016 This class converts degrees in Fahrenheit to Celsius.//
public class TempConvert {
	public static void main(String[] args) {
		int fahrenheit = 32; 
		double conversion = (5.0/9.0)*(fahrenheit-32);
		int celsius = (int)conversion;
		System.out.println(celsius + "*C");

	}

}
