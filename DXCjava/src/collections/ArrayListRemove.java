package collections;

import java.util.ArrayList;

public class ArrayListRemove {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Kakashi");
		al.add("Might Guy");
		al.add("Asuma");
		al.add("Kurenai");
		al.add("Hayate");

		System.out.println("An initial list of elements: "+al);

		al.remove("Asuma");
		System.out.println("After invoking remove(object) method: "+al);

		al.remove(1);
		System.out.println("After invoking remove(index) method: "+al);

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("Might Guy");
		al2.add("Uzuki");

		al.addAll(al2);
		System.out.println("Updated list: "+al);

		al.removeAll(al2);
		System.out.println("After invoking removeAll() method: "+al);

		al.removeIf(str -> str.contains("Hayate"));
		System.out.println("After invoking removeIf() method: "+al);

		al.clear();
		System.out.println("After invoking clear() method: "+al);
	}

}
