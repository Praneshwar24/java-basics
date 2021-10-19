package Basics;

public class Calculator{
	
	int add(int a,int b) {
		System.out.println("Calculator-- add");
		
		int c = a + b;
		System.out.println("Calculator-- add--"+c);
		
		return c;
	}
	
	int sub(int a,int b) {
		return a-b;
	}
	
	int mul(int a,int b) {
		return a*b;
	}
	
	int div(int a,int b) {
		return a/b;
	}
	
}
