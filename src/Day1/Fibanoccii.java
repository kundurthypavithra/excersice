package Day1;

import java.util.Scanner;

public class Fibanoccii {

	public static void main(String[] args) {
		int a=0,b=1;
		int c,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your preferred number ");
		n=sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			
		}

	}

}
