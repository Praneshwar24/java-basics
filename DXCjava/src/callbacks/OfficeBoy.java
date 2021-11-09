package callbacks;

public class OfficeBoy {

	public void doGovtWork(MobilePhone mobilePhone) {
		System.out.println("Going to do some paper work");
		try {
			Thread.sleep(7000);
			System.out.println("I am done with the job");
			mobilePhone.successGreenButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
