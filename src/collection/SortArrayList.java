package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,4,9,6,1));
		myList.sort(null);
		System.out.println("After sorting: " + myList);
	}

}
