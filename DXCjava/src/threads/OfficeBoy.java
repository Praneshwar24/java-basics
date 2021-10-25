package threads;

public class OfficeBoy extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		try {
			Thread.sleep(3000);
			System.out.println("Getting water");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
