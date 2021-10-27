package collections;

import java.util.Iterator;
import java.util.List;

public class LinkedList {
	public static void main(String[] args) {

		List<String> names = new java.util.LinkedList<String>();

		names.add("Naruto");
		names.add("Sasuke");
		names.add("Kakashi");
		names.add("Kakashi");

		System.out.println(names);

		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
