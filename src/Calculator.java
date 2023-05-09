import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num1;
		int num2;
		char operator;
		
		System.out.println("Enter first number: ");
		num1 = scnr.nextInt();
		System.out.println("Enter secend number: ");
		num2 = scnr.nextInt();
		System.out.println("Enter an operator to perform operation on given integers: ");
		operator = scnr.next().charAt(0);
		
		switch(operator){
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}

	}

}
