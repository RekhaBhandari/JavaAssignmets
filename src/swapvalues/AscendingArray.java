package swapvalues;

import java.util.Scanner;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int arraySize;
		int temp;
		System.out.println("Enter the size of array: ");
		arraySize = scnr.nextInt();
		int[] ascArray = new int[arraySize];
		System.out.println("Enter numbers in array: ");
		for(int i = 0; i < arraySize; i++) {
			ascArray[i] = scnr.nextInt();
		}
		System.out.println("Ordered array: ");
		for(int i = 0; i < arraySize; i++) {
			for(int j = i+1; j < arraySize; j++ ) {
			
				if(ascArray[i] > ascArray[j]) {
					temp = ascArray[i];
					ascArray[i] = ascArray[j];
					ascArray[j] = temp;
				}
			}
			
			System.out.print(ascArray[i] + ",");
		}
		

	}

}
