package abstraction;

/**
 * implementation is like sockets
 * @author Lenovo
 *
 */

public class HavellsAppliances implements ISwitchBoardListener {

	@Override
	public void switchOne() {
		System.out.println("Havells fan is on");


	}

	@Override
	public int switchTwo() {
		System.out.println("Havells ac is on");
		return 27;
	}

	@Override
	public boolean switchThree(int type) {
		System.out.println("Havells led is on");
		return false;
	}

	@Override
	public void switchFour() {
		System.out.println("Havells tubelight is on");

	}


}
