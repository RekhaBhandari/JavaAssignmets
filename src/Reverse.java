import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		int divident;
		int reverse=0;
		System.out.println("Enter a number: ");
		num = scnr.nextInt();
		divident = num;
		while(divident != 0) {
			reverse += divident % 10;
			reverse *= 10; 
			divident = divident/10;
		}
		
		System.out.println("Reverse of " + num + " is " + reverse/10);
	}
}
