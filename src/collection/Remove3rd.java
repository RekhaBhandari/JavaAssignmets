package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,4,9,6,1));
		myList.remove(2);
		System.out.println("After Removing: " + myList);
	}

}
