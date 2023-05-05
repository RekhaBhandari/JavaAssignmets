import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a ASCII code (between 0 – 128): ");
		int code = scnr.nextInt();
		System.out.println("Corresponding Chrater is: "  + (char)code);
		
	} 

}
