package Marks;

import java.util.Scanner;

public class Details implements Student {
	int math,science,english,rollnum;
	String Name;
	Scanner sc=new Scanner(System.in);
	@Override
	public void details() {
		System.out.println("Enter the name of student: ");
		Name=sc.next();
		System.out.println("Enter the rollno of student:  ");
		rollnum=sc.nextInt();
		System.out.println("Enter the math marks: ");
		math=sc.nextInt();
		System.out.println("Enter the science marks: ");
		science=sc.nextInt();
		System.out.println("Enter the English marks: ");
		english=sc.nextInt();
		
	}

	

	@Override
	public void totalmarks() {
		System.out.println("The total marks of "+Name+" are "+(math+science+english));
		
		
	}

	@Override
	public void average() {
		System.out.println("The average of "+Name+" is "+(math+science+english)/3);
		
	}

	
}
