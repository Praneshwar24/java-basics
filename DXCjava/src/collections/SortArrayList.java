package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	public static void main(String[] args) {
		//Creating a list of fruits

		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Grapes");
		list1.add("Banana");
		list1.add("Apple");
		list1.add("Pineapple");

		Collections.sort(list1);
		for(String fruits : list1)
			System.out.println(fruits);

		System.out.println("Sorting numbers...");
		//creating a list of numbers(int)
		List<Integer> list2 = new ArrayList<Integer>();

		list2.add(21);
		list2.add(55);
		list2.add(67);
		list2.add(100);
		list2.add(99);

		Collections.sort(list2);

		for(Integer num : list2)
			System.out.println(num);

	}

}
