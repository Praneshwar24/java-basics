package polymorphism;

class Animal {
	Animal(){
		System.out.println("An animal is created");
	}}
	class Dog extends Animal{
		Dog(){
			super();
			System.out.println("A dog is created");
		}
	}


