package abstraction;

public class BmwFlyingCar extends FlyingCar{

	@Override
	public void stopCar() {
		System.out.println();
		
	}

	@Override
	public void flyCar() {
		System.out.println();
		
		
	}

	@Override
	public void landCar() {
		System.out.println();
		
		
	}

	public static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public static boolean isEligibleToVote(int age) {
		if(age>17) {
			return true;
		}
		
		return false;
	}
	
		
		
	
	
	}


