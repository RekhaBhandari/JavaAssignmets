package swapvalues;

import java.util.Scanner;



public class myArray {
	
	public static void secondLargest(int [] myArr) {
		int size = myArr.length;
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++ ) {
			
				if(myArr[i] > myArr[j]) {
					int temp = myArr[i];
					myArr[i] = myArr[j];
					myArr[j] = temp;
				}
			}
		}
		
		System.out.println("The second largest value is: " + myArr[size - 2]);
	}
	
	public static void duplicateElements(int [] myArr) {
		int size = myArr.length;
		System.out.println("Duplicate elements are: ");
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++ ) {
				
				if(myArr[i] == myArr[j]) {
					System.out.print(myArr[i] + ", ");
					break;
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int arraySize;
		int temp;
		System.out.println("Enter the size of array: ");
		arraySize = scnr.nextInt();
		int[] userArray = new int[arraySize];
		System.out.println("Enter numbers in array: ");
		for(int i = 0; i < arraySize; i++) {
			userArray[i] = scnr.nextInt();
		}
		
		secondLargest(userArray);
		duplicateElements(userArray);
		

	}

}
