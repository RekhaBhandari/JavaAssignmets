import java.util.Scanner;

public class SolveMathematical {
	public static int fact(int num) {
		int factorial = 1;
		while(num > 0) {
			factorial *= (num);
			num--;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scnr.nextInt();
		double a = 0 ;
		for(int i = 1; i<= n ; i++) {
			a += (double)i/fact(i); 
		}

		System.out.println("The final value of a is " + a);
	}

}
