import java.util.Scanner;

public class Perimeters {
		public static double perimeter(double radius) {
			return Math.PI * radius * 2;
			
		}
		public static double perimeter(double a, double b, double c) {
			return (a + b + c);
		}
		public static double perimeter(double base, double height) {
			return 2 * (base + height);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scnr = new Scanner(System.in);
			double radius;
			double base;
			double height;
			double perimeter;
			char shape;
			
			
			
			while(true) {
				System.out.println("Type of shape?(Enter 'c' or 'C' for circle, "
						+ "'t' OR 'T' for triangle and 'r' or 'R' for rectangle): ");
				shape = scnr.next().charAt(0);
			
				if(shape == 'c' || shape == 'C') {
					System.out.println("Enter radius of circle");
					radius = scnr.nextDouble();
					perimeter = perimeter(radius);
					System.out.println("Perimeter of circle is: " + perimeter);
				}
				else if(shape == 't' || shape == 'T') {
					System.out.println("Enter length first side of triangle: ");
					double a = scnr.nextDouble();
					System.out.println("Enter length of second side of triangle: ");
					double b = scnr.nextDouble();
					System.out.println("Enter length of third side of triangle: ");
					double c = scnr.nextDouble();
				
					perimeter = perimeter(a, b, c);
			
					System.out.println("Perimeter of triangle is " + perimeter);
				}
				else if(shape == 'r' || shape == 'R') {
					System.out.println("enter base of rectangle: ");
					base = scnr.nextDouble();
					System.out.println("Enter height of rectangle: ");
					height = scnr.nextDouble();
			
					perimeter = perimeter(base, height);
			
					System.out.println("Perimeter of rectangle is " + perimeter);
				}
				else {
					System.out.println("Invalid shape");
				}
			
				System.out.println("Do you want to continue with more shapes? (press y/Y to continue or press any other key to exit): ");
				char repeat = scnr.next().charAt(0);
				if(!(repeat == 'y' || repeat == 'Y')) {
					break;
				}
			}
		}
}
