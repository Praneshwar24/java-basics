package threads;

public class NocProcess {
	public static void main(String[] args) {
		FeeThread feeThread = new FeeThread();
		feeThread.start();
		OfficeBoy ramu = new OfficeBoy();
		ramu.start();

		//oldSequentialWay();
	}

	private static void oldSequentialWay(){
		try {
			//fee
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			//hostel
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			//library
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			//transport
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
