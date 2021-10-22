package exceptions;

public class MultiCatchBlock {
	public static void main(String[] args) {
		try {

			int a[] = new int[5];
			a[5] = 50/0;


			//int a[] = {1,5,7,9};
			//System.out.println(a[7]);//ArrayIndexOutOfBounds Exception

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBounds Exception occurs");
			//e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch (Exception e) {
			System.out.println("Exception occurs");
		}
		System.out.println("rest of the code");
	}

}
