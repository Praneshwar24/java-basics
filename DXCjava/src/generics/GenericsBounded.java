package generics;

public class GenericsBounded {
	public static void main(String[] args) {

		AccountBounded<Integer> gpayAcccount = new AccountBounded<>();
		gpayAcccount.setObj(987654321);
		System.out.println("The gpay account no is "+gpayAcccount.getObj());

		AccountBounded<Float> paytmAccount = new AccountBounded<>();
		paytmAccount.setObj(3.14f);
		System.out.println("The paytm account no is "+paytmAccount.getObj());

	}

}
