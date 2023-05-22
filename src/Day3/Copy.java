package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		int i,size1,size2;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		System.out.println("Enter the size of array1: ");
		size1=sc.nextInt();
		System.out.println("Enter the size of array2");
		size2=sc.nextInt();
		for(i=0;i<size1;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th value of array1"));
			list1.add(sc.nextInt());
		}
		for(i=0;i<size2;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th value of array2"));
			list2.add(sc.nextInt());
		}
		for(i=0;i<size2;i++) {
			list1.add(list2.get(i));
		}
		System.out.println("The updated array is: ");
		System.out.println(list1);

	}

}
