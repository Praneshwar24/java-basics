package collections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayListForEachLoop {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Sasuke");
		names.add("Sakura");

		System.out.println(names);

		for(String name : names) {
			System.out.println("The name is "+name);
		}
	}

}
