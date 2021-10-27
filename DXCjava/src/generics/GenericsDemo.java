package generics;

public class GenericsDemo {
	public static void main(String[] args) {
		
		Account<String> account = new Account<String>();
		account.setObj("SBI account");
		System.out.println(account.getObj());
		
		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setObj(6473733);
		System.out.println("The gpay account no is "+gpayAccount.getObj());
	}

}