package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TargetValue {
	
	public static ArrayList<Integer[]> findValues(Integer[] myArr, int targetValue) {
		
		ArrayList<Integer[]> finalArr = new ArrayList<>();
		
		int size = myArr.length;
		for(int i = 0; i < size; i++) {
			
			for(int j = i; j < size; j ++) {
				Integer[] rslt = new Integer[2];
				if((myArr[i] + myArr[j]) == targetValue) {
				rslt[0] = myArr[i];
				rslt[1] = myArr[j];
				finalArr.add(rslt);
				break;
				}
			}
				
		}
		
		
		return finalArr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		Integer[] userArray = {4,9,5, 2,1,8,11,3,6,7,0};
		System.out.println("Enter a target: ");
		int target = scnr.nextInt();
		ArrayList<Integer[]> resultArray = findValues(userArray, target);
		System.out.println("The pair that form target are:: ");
		for (Integer[] arr : resultArray) {
			System.out.println(List.of(arr));
		}
//		System.out.println(List.of(resultArray));

	}

}
