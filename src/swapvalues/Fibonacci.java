package swapvalues;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the length of series: ");
		int n = scnr.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 0;i < n ;i++ ) {
			System.out.print((b) + ", ");
			b = a + b;
			a = b - a;
		}
		
	}

}
