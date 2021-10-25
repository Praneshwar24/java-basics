package threads;
 class TestJoinMethod1 extends Thread {

	public void run() {
		//System.out.println(Thread.currentThread().getName());
		for(int i=1; i <= 5; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i +"--"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		t1.setName("First thread");
		TestJoinMethod1 t2 = new TestJoinMethod1();
		t2.setName("Second thread");
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t3.setName("Third thread");

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();

		t3.start();




	}

}
