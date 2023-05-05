import java.util.Scanner;

public class TemperatureConversion {
	
	public static double toCelsius(double fahrenheit) {
		double celsius = ((5.0 / 9.0) * (fahrenheit - 32));
		return celsius;	
	}
	
public static double toFahrenheit(double celsius) {
		double fahrenheit = (9.0/5.0 * celsius + 32);
		return fahrenheit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		System.out.println("Temperature in Fahrenheit: ");
		fahrenheit = scnr.nextDouble();
		celsius = toCelsius(fahrenheit);
		System.out.printf("%.2f Fahrenheit is equal to %.2f\n",fahrenheit, celsius);

		System.out.println("Temperature in celsius");
		celsius = scnr.nextDouble();
		fahrenheit = toFahrenheit(celsius);
		System.out.printf("%.2f Celsius is equal to %.2f",celsius, fahrenheit);
		

	}

}
