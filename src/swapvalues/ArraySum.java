package swapvalues;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		double[] sumArray = new double[5];
		System.out.println("Enter 5 numbers: ");
		for(int i = 0; i < 5; i++) {
			sumArray[i] = scnr.nextDouble();
		}
		
		double sum = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += sumArray[i];
		}
		
		System.out.println("Total sum is " + sum);

	}

}
