package Employee;

import java.util.Scanner;

public class Manager implements Employee {

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
		
		System.out.println("Congrats Manager "+Name);
		System.out.println("As your salary is "+lpa+" You are eligibe for a hike of 20%. After Increament your LPA changed to "+(lpa+lpa*0.2));
		
		
	}

}
