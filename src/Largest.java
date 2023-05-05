import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		int c = scnr.nextInt();
		
		if(a > b) {
			if(a > c) {
				System.out.println("The greatest number is " + a);
			}
			else {
				System.out.println("The greatest number is " + c);
			}
		}
		else {
			if(b > c) {
				System.out.println("The greatest number is " + b);
			}
			else {
				System.out.println("The greatest number is " + c);
			}
		}

	}

}
