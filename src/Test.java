//
//public class Test {
//public static void main(String[] args) {
//B b = new B();
//b.m(5);
//System.out.println("i is " + b.i);
//}
//}
//
//class A {
//int i;
//
//public void m(int i) {
//this.i = i;
//}
//}
//
//class B extends A {
//public void m(String s) {
//}
//}
//
//
//
//////
////public class Test {
////	
////	public static void main(String[] args) {
////		
////		
//////			String s = "abc";
//////			System.out.println(s.charAt(3));
////			
////		
////		
//////		int[] list = new int[5];
//////		list = new int[6];
//////		
//////		System.out.println(list.length);
////		
//////		int y = 0;
//////		for (int i = 0; i < 10; ++i) {
//////		y += i;
//////		}
//////		System.out.println(y);
////		
//////		System.out.println(max(1, 2));
//////		}
//////
//////		public static double max(int num1, double num2) {
//////		System.out.println("max(int, double) is invoked");
//////
//////		if (num1 > num2)
//////		return num1;
//////		else
//////		return num2;
//////		}
//////
//////		public static double max(double num1, int num2) {
//////		System.out.println("max(double, int) is invoked");
//////
//////		if (num1 > num2)
//////		return num1;
//////		else
//////		return num2;
////		}
////	
////	
//////	public static void main(String[] args) {
//////		
//////		
//////		int number = Integer.MAX_VALUE + 1;
//////		System.out.println(number);
//////		
//////	}
////}
////////		try {
////////		String s = "5.6";
////////		Integer.parseInt(s); // Cause a NumberFormatException
////////
////////		int i = 0;
////////		int y = 2 / i;
////////		}
////////		catch (Exception ex) {
////////		System.out.println("NumberFormatException");
////////		}
////////		catch (RuntimeException ex) {
////////		System.out.println("RuntimeException");
////////		}
////////		}
//////	
//////	
//////	public static void main(String[] args) {
//////		
//////		System.out.println(4 + 20 / (3 - 1) * 2);
//////		
//////		
////////		try {
////////		p();
////////		System.out.println("After the method call");
////////		}
////////		catch (NumberFormatException ex) {
////////		System.out.println("NumberFormatException");
////////		}
////////		catch (RuntimeException ex) {
////////		System.out.println("RuntimeException");
////////		}
////////		}
////////
////////		static void p() {
////////		String s = "5.6";
////////		Integer.parseInt(s); // Cause a NumberFormatException
////////
////////		int i = 0;
////////		int y = 2 / i;
////////		System.out.println("Welcome to Java");
//////		}
//////}
////
////
//////public class Test extends A {
//////Circle c = new Circle(5);
//////	
//////public static void main(String[] args) {
//////Test t = new Test();
//////t.print();
//////}
//////}
//////
//////class A {
//////String s;
//////
////////A(String s) {
////////this.s = s;
////////}
//////
//////public void print() {
//////System.out.println(s);
//////}
//////}