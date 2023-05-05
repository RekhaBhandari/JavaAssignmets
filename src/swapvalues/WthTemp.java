package swapvalues;

import java.util.Scanner;

public class WthTemp {
	public static void main(String [] args) {
		int x, y, temp;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter first number : ");
		x = scnr.nextInt();
		System.out.println("Enter second number; ");
		y = scnr.nextInt();
		
		System.out.println("Before swapping number are: " + x + " and " + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After swapping number are: " + x + " and " + y);
		
		
		
	}
}
