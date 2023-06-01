package Day5;

import java.util.Scanner;

public class reversingwords {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		s=sc.nextLine();
		String[] ar=s.split("\\s");
		for(String j:ar) {
			for(int i=j.length()-1;i>=0;i--) {
				System.out.print(j.charAt(i));
				
			}
			System.out.print(" ");
		}
		

	}

}
