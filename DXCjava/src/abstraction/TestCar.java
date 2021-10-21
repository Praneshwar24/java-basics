package abstraction;

public class TestCar {
	public static void main(String[] args) {
		FlyingCar flyingCar = new BmwFlyingCar();
		flyingCar.startCar();
		flyingCar.stopCar();
		flyingCar.flyCar();
		flyingCar.landCar();


	}

}
