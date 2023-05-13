package collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AppendInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(5,3,2,4,9,6,1));
		System.out.println("Enter an element to append: ");
		int element = scnr.nextInt();
//		myList.add(element);
		myList.addLast(element);
		System.out.println("new list: " + myList);
	}

}
