package collection;

import java.util.Arrays;
import java.util.*;

public class MyHashSet {
	
	public static void ifEmpty(HashSet<Integer> checkSet) {
		if(checkSet.isEmpty()) {
			System.out.println("The hash set is empty.");
		}
		else {
			System.out.println("The hash set is not empty.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> mySet = new HashSet<Integer>();
		ifEmpty(mySet);
		mySet.addAll(Arrays.asList(5,3,2,4,9,6,1));
		ifEmpty(mySet);
	}

}
