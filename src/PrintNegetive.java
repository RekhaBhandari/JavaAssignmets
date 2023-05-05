import java.util.Scanner;

public class PrintNegetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scnr.nextInt();
		
		if(num < 0) {
			System.out.println("The entered negetive number is " + num);
		}

	}

}
