import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number: ");
		num = scnr.nextInt();
		
		System.out.println(".........................................................");
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}

	}

}
