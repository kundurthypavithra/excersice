package Salaryupdate;

import java.util.Scanner;

public class Implementations implements Employee{
	int salarypermonth,age,lpa;
	String Name;
	Scanner sc=new Scanner(System.in);
	@Override
	public void details() {
		System.out.println("Enter your name: ");
		Name=sc.next();
		System.out.println("Enter your monthly salary");
		salarypermonth=sc.nextInt();
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		
	}

	@Override
	public void LPA() {
		lpa=salarypermonth*12;
		System.out.println("Your current LPA is: "+lpa);
		
	}

	@Override
	public void Increament() {
		if(age>50) {
			System.out.println("Congrats "+Name);
			System.out.println("As your salary is "+lpa+" and your age is "+age+" You are eligibe for a hike of 20%. After Increament your LPA changed to "+(lpa+lpa*0.2));
		}
		else {
			System.out.println("Congrats "+Name);
			System.out.println("As your salary is "+lpa+" and your age is "+age+" You are eligibe for a hike of 10%. After Increament your LPA changed to "+(lpa+lpa*0.1));
			
		}
		
		
	}

}
