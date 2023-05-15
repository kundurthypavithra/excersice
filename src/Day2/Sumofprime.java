package Day2;

import java.util.Scanner;

public class Sumofprime {

	public static void main(String[] args) {
		int num,count,sum=0,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			count=0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0) {
					count=count+1;
					break;
				}
				
			}
			if(count==0 && i!=1) {
				sum=sum+i;
			}
		}
		System.out.print("Sum of prime numbers is: "+sum);
		

}
}
