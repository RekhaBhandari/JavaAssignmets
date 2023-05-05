import java.util.Scanner;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = scnr.nextInt();
		
		System.out.println("Enter second number: ");
		int b = scnr.nextInt();
		
		if(a == b) {
			System.out.println("Both number are equal");
		}
		else if(a > b) {
			System.out.println(" first number i.e. " + a + " is greater than second number i.e. " + b);
		}
		else if(a < b) {
			System.out.println(" first number i.e. " + a + " is less than secend number i.e. " + b);
		}
		else {
			System.out.println("Unknown");
		}
	}

}
