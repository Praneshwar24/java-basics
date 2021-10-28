package generics;

public class DemoGenericElements {
	public static <E> void printArray(E[] elements) {
		for(E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40};
		Character[] charArray = {'P','R','A','N','E','S','H'};
		System.out.println("IntArray is displayed");
		printArray(intArray);
		System.out.println("CharArray is displayed");
		printArray(charArray);

	}

}


