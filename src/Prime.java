import java.util.Scanner;

public class Prime {
	public static void isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("Not a prime number.");
				return;
			}
			
		}
		System.out.println("It is a prime number");
	}
	public static void firstNthPrime(int n){
		int count = 0;
		int num = 2;
		
		while(count < n) {
			char isPrime = 'Y';
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrime = 'N';
					break;
				}
			}
			if(isPrime == 'Y') {
				System.out.print(num + " ");
				count++;
			}
			num++;
			
			
		}
		
	}
	
	public static void allPrimebetween(int start , int  end) {
		
		for(int i = start; i <= end; i++) {
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				System.out.print(i + ", ");
			}
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number to check prime: ");
		int num = scnr.nextInt();
		isPrime(num);
		System.out.println("Enter a number to display first Nth prime numbers: ");
		int n = scnr.nextInt();
		firstNthPrime(n);
		System.out.println();
		System.out.println("Enter 2 numbers: ");
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		allPrimebetween(a, b);
	}

}
