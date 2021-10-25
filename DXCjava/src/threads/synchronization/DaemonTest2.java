package threads.synchronization;

public class DaemonTest2 extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread work");
		}
		else {
			System.out.println("User thread work");
		}
	}
	public static void main(String[] args) {
		DaemonTest2 t1 = new DaemonTest2();
		DaemonTest2 t2 = new DaemonTest2();
		DaemonTest2 t3 = new DaemonTest2();

		t1.setDaemon(true);//now t1 is a daemon thread

		t1.start();
		
		t2.start();
		
		t3.start();
	}



}
