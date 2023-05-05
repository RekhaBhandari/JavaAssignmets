package swapvalues;

import java.util.Scanner;

public class WthOutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter first number : ");
		x = scnr.nextInt();
		System.out.println("Enter second number; ");
		y = scnr.nextInt();
		
		System.out.println("Before swapping number are: " + x + " and " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After swapping number are: " + x + " and " + y);

	}

}
