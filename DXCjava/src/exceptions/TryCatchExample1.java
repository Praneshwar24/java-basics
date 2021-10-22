package exceptions;

public class TryCatchExample1 {
	public static void main(String[] args) {


		try {
			int data = 50/2;
			System.out.println("the answer is "+data);

			System.out.println("rest of the code");
		} catch (ArithmeticException e) { //handles the exception
			e.printStackTrace();
		}
	}


}
