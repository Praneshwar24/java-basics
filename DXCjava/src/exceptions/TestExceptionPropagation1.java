package exceptions;

public class TestExceptionPropagation1 {
	void m() {
		System.out.println("I am in M");
		int data = 50/0;
		//System.out.println("the data is "+data);
		System.out.println("I am in M after exception");


	}
	void n() {
		System.out.println("I am in N");
		m();
		System.out.println("I am in N after exception");
	}void p(){
		System.out.println("I am in P");

		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception handled");

			System.out.println("I am in P after exception");


		}

	}
	public static void main(String[] args) {
		System.out.println("I am in MAIN");

		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();

		System.out.println("I am in MAIN after exception");

		System.out.println("Normal flow...");

	}

}
