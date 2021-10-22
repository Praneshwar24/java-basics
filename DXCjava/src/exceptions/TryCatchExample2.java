package exceptions;

public class TryCatchExample2 {
	public static void main(String[] args) {
		try {
			int data = 50/0;
			System.out.println("The remainder is "+data);
			
		} catch (Exception e) {
			System.out.println("It cant be divided by zero");
			//e.printStackTrace();
		}
	}

}
