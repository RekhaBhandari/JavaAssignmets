import java.util.Scanner;

public class TypesOfTriangle {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double side1, side2, side3;
		
		System.out.println("Enter 3 sides of triangle: ");
		side1 = scnr.nextDouble();
		side2 = scnr.nextDouble();
		side3 = scnr.nextDouble();
		
		if(side1 == side2 && side1 == side3) {
			System.out.println("This is a equilateral triangle.");
		}
		else if(side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("This is isoceles triangle");
		}
		else {
			System.out.println("This is scalene triangle");
		}
	}

}
