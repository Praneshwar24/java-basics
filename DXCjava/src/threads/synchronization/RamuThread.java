package threads.synchronization;

public class RamuThread extends Thread{
	Table mtable;

	public RamuThread(Table table) {
		mtable = table;
	}
	@Override
	public void run() {

		super.run();

		mtable.printTable(5);
	}

}
