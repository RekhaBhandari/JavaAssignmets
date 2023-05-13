package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(5,3,2,4,9,6,1));
		System.out.println("Before Conversion myList: " + myList.getClass());
		
		ArrayList<Integer> myArrayList = new ArrayList(myList);
		System.out.println("Before Conversion myArrayList: " + myArrayList.getClass());
	}

}
