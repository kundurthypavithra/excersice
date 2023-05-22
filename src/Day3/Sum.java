package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int i,count=0,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		size=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(i=0;i<size;i++) {
			System.out.println("Enter the value of "+(i+1)+" th element");
			list.add(sc.nextInt());
			}
		for(i=0;i<size;i++) {
			count=count+list.get(i);
		}
		System.out.println("The sum of the elements is: "+count);
		
		

	}

}
