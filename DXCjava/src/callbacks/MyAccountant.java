package callbacks;

public class MyAccountant implements MobilePhone{

	@Override
	public void successGreenButton() {
		System.out.println("releasing the payment as the job is done successfully");
	}

	@Override
	public void failureRedButton() {
		System.out.println("imposing penalty since the job is not done");
	}

}
