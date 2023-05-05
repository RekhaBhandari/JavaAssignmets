import java.util.*;
 
public class Area {
	public static double area(double radius) {
		return Math.PI * radius * radius;
		
	}
	
	public static double area(double base, double height) {
		return base * height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		double radius;
		double base;
		double height;
		double area;
		char shape;
		
		
		
		while(true) {
			System.out.println("Type of shape?(Enter 'c' or 'C' for circle, "
					+ "'t' OR 'T' for triangle and 'r' or 'R' for rectangle): ");
			shape = scnr.next().charAt(0);
			
			if(shape == 'c' || shape == 'C') {
				System.out.println("Enter radius of circle");
				radius = scnr.nextDouble();
				area = area(radius);
				
				System.out.println("Area of circle is: " + area);
			}
			else if(shape == 't' || shape == 'T') {
				System.out.println("enter base of triangle: ");
				base = scnr.nextDouble();
				System.out.println("Enter height of triangle: ");
				height = scnr.nextDouble();
				
				
				area = area(base, height)/2;
				
				System.out.println("Area of triangle is " + area);
				
			}
			else if(shape == 'r' || shape == 'R') {
				System.out.println("enter base of rectangle: ");
				base = scnr.nextDouble();
				System.out.println("Enter height of rectangle: ");
				height = scnr.nextDouble();
				
				area = area(base, height);
				
				System.out.println("Area of rectangle is " + area );
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
