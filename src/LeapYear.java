import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scnr.nextInt();
		if(year % 4 == 0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}
		

	}

}
