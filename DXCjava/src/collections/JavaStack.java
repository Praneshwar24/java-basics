package collections;

import java.util.Iterator;
import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		stk.push("Pranesh");
		stk.push("Ranjith");
		stk.push("Rahul");
		stk.push("Surya");
		stk.push("Sathish");
		stk.pop();

		Iterator<String> itr = stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
