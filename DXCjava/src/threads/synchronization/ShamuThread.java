package threads.synchronization;

public class ShamuThread extends Thread{
	Table mtable;

	public ShamuThread(Table table) {
		mtable = table;
	}
	@Override
	public void run() {

		super.run();

		mtable.printTable(100);
	}


}
