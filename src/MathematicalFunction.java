import java.util.Scanner;

public class MathematicalFunction {
	static Scanner scnr = new Scanner(System.in);
	
	public static void calculateSValue(){
		double s, u, t, a;
		
		System.out.println("Enter value of u: ");
		u = scnr.nextDouble();
		
		System.out.println("Enter value of t: ");
		t = scnr.nextDouble();
		
		System.out.println("Enter value of a: ");
		a = scnr.nextDouble();
		 
		s = (u * t) + (1/2 * a * t * t);
		
		System.out.println("Value of s is : " + s );
	}
	
	public static void calculateArea() {
		double area, a, b, c, s;
		System.out.println("Enter value of a: ");
		a = scnr.nextDouble();
		
		System.out.println("Enter value of b: ");
		b = scnr.nextDouble();
		
		System.out.println("Enter vaue of c: ");
		c = scnr.nextDouble();
		
		System.out.println("Enter value of s");
		s = scnr.nextDouble();
		
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.println("Area is: " + area);
		
	}
	
	public static void calculateX() {
		double a, b, c, x;
		System.out.println("Enter value of a: ");
		a = scnr.nextDouble();
		
		System.out.println("Enter value of b: ");
		b = scnr.nextDouble();
		
		System.out.println("Enter vaue of c: ");
		c = scnr.nextDouble();
		
		x = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		
		System.out.println("Value of X is : "  + x);
	}
	
	public static void main(String [] args) {
		calculateSValue();
		calculateArea();
		calculateX();
	}

}
