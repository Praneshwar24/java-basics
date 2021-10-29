package design.patterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
	public static void main(String[] args) throws IOException{
		GetPlanFactory planFactory = new GetPlanFactory();

		System.out.println("Enter the name of the plan for which the bill will be generated: ");
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();
		System.out.println("Enter the number of units for bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());

		Plan plan = planFactory.getPlan(planName);
		//call getRate() method and calculateBill()method of DomesticPlan.

		System.out.println("Bill amount for "+planName+" of "+units+" units is: ");
		plan.getRate();
		plan.calculateBill(units);


	}

}
