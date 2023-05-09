import java.util.Scanner;

public class SumToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.println("Enter a natural number: ");
		n = scnr.nextInt();
		
		if(n <= 0) {
			System.out.println("The given number is not a natural number.");
		}
		else {
			for(int i = 1; i <= n; i++) {
				sum += i;
			}
		}
		System.out.println("The sum upto " + n + " is: " + (sum));

	}

}
