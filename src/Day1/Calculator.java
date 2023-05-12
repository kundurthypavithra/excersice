package Day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		float a,b,sum,sub,mul,div;
		char operator;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your first number ");
		a=sc.nextFloat();
		
		System.out.print("Enter your second number ");
		b=sc.nextFloat();
		System.out.print("Enter your required operator among + , - , * , / ");
		operator=sc.next().charAt(0);
		
		if(operator=='+') {
			sum=a+b;
			System.out.print("The result is "+sum);
		}
		if(operator=='-') {
			sub=a-b;
			System.out.print("The result is "+sub);
		}
		if(operator=='*') {
			mul=a*b;
			System.out.print("The result is "+mul);
		}
		if(operator=='/') {
			div=a/b;
			System.out.print("The result is "+div);
		}
		
	}

}
