package exceptions;

public class UncheckedException {
	public static void main(String[] args) {

		try {

			int arr[] = {1,5,8,9};
			System.out.println(arr[10]);
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("rest of the code");

	}

}
