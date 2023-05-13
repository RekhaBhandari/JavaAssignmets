package collection;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scnr.nextInt();
		String numString = String.valueOf(num);
		StringBuilder numStringBuild = new StringBuilder(numString);
		numStringBuild.reverse();
		System.out.println(numString + ", " + numStringBuild);
		if(numString.equals(numStringBuild.toString())) {
			System.out.println("The number is a palindrome number.");
		}
		else {
			System.out.println("It is not a palindrome number.");
		}
	}

}
