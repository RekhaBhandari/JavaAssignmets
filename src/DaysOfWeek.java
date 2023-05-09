import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num;
		String day;
		System.out.println("Enter a number: ");
		num = scnr.nextInt();
		
		switch (num) {
			case 1: 
				day = "Sunday";
				break;
			case 2:
				day = "Monday";
				break;
			case 3:
				day = "Tuesday";
				break;
			case 4:
				day = "Wednesday";
				break;
			case 5: 
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			case 7:
				day = "Saturday";	
				break;
			default:
				System.out.println("invalid day");
				return;
			
		}
		System.out.println("The entered day of the week is " + day);

	}

}
