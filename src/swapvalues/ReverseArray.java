package swapvalues;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int arraySize;
		int temp;
		System.out.println("Enter the size of array: ");
		arraySize = scnr.nextInt();
		int[] revArray = new int[arraySize];
		System.out.println("Enter numbers in array: ");
		for(int i = 0; i < arraySize; i++) {
			revArray[i] = scnr.nextInt();
		}
		System.out.println("Reversed array: ");
		int median = arraySize/2;
		
		for(int i = 0; i < median; i++) {
			temp = revArray[i];
			revArray[i] = revArray[(arraySize -1) - i];
			revArray[(arraySize -1) - i] = temp;
		}
		for(int i = 0; i < arraySize; i++) {
			System.out.print(revArray[i] + ", ");
		}
	}
	
	

}
