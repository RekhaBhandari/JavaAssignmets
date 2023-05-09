import java.util.Scanner;

public class SumAndProduct {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		System.out.println("Enter a number: ");
		num = scnr.nextInt();
		int n = num;
		int sum = 0;
		int product = 1;
		while(n != 0) {
			int digit = n%10;
			sum +=digit;
			product *= digit;
			n = n/10;
		}
		System.out.println("Sum of each digit of " + num + " is: " + sum);
		System.out.println("Product of each digit of " + num + " is: " + product);
	}

}
