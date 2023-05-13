package collection;

import java.util.HashMap;
import java.util.Map;

public class CountKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap();
		map.put(1, "Norfolk");
		map.put(2, "Virginia Beach");
		map.put(3, "Portsmouth");
		map.put(4, "Suffolk");
		
		System.out.println("Number of Key-value pair in map: " + map.size());
	}

}
