import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		double radius;
		double length;
		double volume; 
		
		System.out.println("Enter radius: ");
		radius = scnr.nextDouble();
		
		System.out.println("Enter length: ");
		length = scnr.nextDouble();
		
		volume = Math.PI * radius * radius * length;
		
		System.out.printf("Volume of cylinder is: %.2f",volume);

	}

}
