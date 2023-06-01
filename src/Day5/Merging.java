package Day5;

import java.util.Scanner;

public class Merging {

	public static void main(String[] args) {
		String s,s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first statement");
		s=sc.nextLine();
		System.out.println("Enter the second statement");
		s1=sc.nextLine();
		s=s.concat(" "+s1);
		System.out.println("The updated string is: "+s);

	}

}
