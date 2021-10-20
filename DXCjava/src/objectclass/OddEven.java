package objectclass;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		
				
		findOddEven(num);
		
	}

	private static void findOddEven(int number) {
		if(number% 2 == 0) {
			System.out.println("it is a even num");
			
		}
		else {
			System.out.println("it is an odd num");
		}
		
		
	}
	

}
