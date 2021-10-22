package exceptions;

public class TestFinally {
	public static void main(String[] args) {
		try {
			int data = 25/0;//an exception is thrown---- making a call

			System.out.println("the data is "+data);
			
		} catch (Exception e) {
			//catch block receives the call when the exception occurs
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block got executed");
		}
	}

}
