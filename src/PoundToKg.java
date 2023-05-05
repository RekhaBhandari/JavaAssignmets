import java.util.*;

public class PoundToKg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter wt in pound");
		double pound = scnr.nextDouble();
		double kg = pound * 0.45359237;
		System.out.printf("%.2f pound is %.2f kg",pound,kg);
	}

}
