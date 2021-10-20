package Basics;

public class DebugDemo {
	
	public static void main(String[] args) {
		System.out.println("DebugDemo-- main");
		Calculator calc = new Calculator();
		int sum = calc.add(10,20);
		System.out.println("the sum is--"+sum);
		Student pranesh = new Student("pranesh",123);
		Student myStudent = new Student();
		Student yourStudent = new Student("roy");
		
		for(int a=0; a<5; a++) {
			int f = a + 5 * 3;
			System.out.println("the no is="+f);
		}
		
	}
	
}
