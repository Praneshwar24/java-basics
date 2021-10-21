package methodOverriding;

	class Bike extends MethodOverriding{
		void run() {
			System.out.println("Bike is moving");
		}
		public static void main(String args[]) {
			Bike obj = new Bike();
			obj.run();
		}

}
