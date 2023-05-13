package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterateReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(5,3,2,4,9,6,1));
		System.out.println("Reverse Order: ");
//		int size = myList.size();
		ListIterator<Integer> iterator = myList.listIterator(myList.indexOf(myList.getLast()));
		System.out.println(myList.getLast());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
//		System.out.println(myList.listIterator(myList.getLast()).hasPrevious());
//		while(myList.listIterator(size).hasPrevious()) {
//			System.out.println(myList.listIterator().previousIndex());
//		}

	}

}
