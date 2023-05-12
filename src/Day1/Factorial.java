package Day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num,i,f=1,factorial;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number ");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			factorial=i*f;
			f=factorial;
			}
		System.out.print("The factorial of given number is "+f);
		}

}
