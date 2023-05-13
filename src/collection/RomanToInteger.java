package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
	
		System.out.println("Enter a roman number: ");
		String in = scnr.next();
		 
		int sum = 0;
		for(int i = 0; i < in.length(); i++ ) {
			int num;
			if(i != (in.length()-1) && (romanMap.get(in.charAt(i)) < romanMap.get(in.charAt(i + 1)))) {
				num = romanMap.get(in.charAt(i + 1)) - romanMap.get(in.charAt(i));
				i++;
			}
			else {
				num = romanMap.get(in.charAt(i));
			}
			sum += num;
		}
	
		System.out.println("The corresponding integer number is: " + sum);
	
	}

}
