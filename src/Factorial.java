import java.util.Scanner;

public class Factorial {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num;
		int factorial = 1;
		
		System.out.println("Enter a number: ");
		num = scnr.nextInt();
		
		while(num > 0) {
			factorial *= (num);
			num--;
		}
		System.out.println("Factorial number is: " + factorial);
		

	}

}
