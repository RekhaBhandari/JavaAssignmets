import java.util.Scanner;

public class SumAvg {
	public static void main(String [] args) {
		int num1;
		int num2;
		int sum = 0;
		try (Scanner scnr = new Scanner(System.in)) {
			System.out.print("First number : ");
			num1 = scnr.nextInt();
			System.out.print("Second number: ");
			num2 = scnr.nextInt();
			sum = num1 + num2;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: "+ (float)sum/2);
	}
}
