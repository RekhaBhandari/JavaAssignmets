import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Principle: ");
		Double P = scnr.nextDouble();
		System.out.println("Time: ");
		Double T = scnr.nextDouble();
		System.out.println("Rate: ");
		Double R = scnr.nextDouble();
		
		Double interest = (P * T * R)/100;
		System.out.println("Simple Interest is: " + interest);
		
		
	}

}
