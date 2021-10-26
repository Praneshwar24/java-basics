package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAll {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Pranesh");
		al.add("Rahul");
		al.add("Ranjith");

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("Satish");
		al2.add("Pranesh");

		al.retainAll(al2);

		System.out.println("Iterating the elements after retaining the elements of al2");

		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
