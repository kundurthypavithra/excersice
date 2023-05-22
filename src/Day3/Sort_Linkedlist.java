package Day3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Sort_Linkedlist {

	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of linkedlist");
		size=sc.nextInt();
		LinkedList<Integer> l1=new LinkedList<>();
		for(i=0;i<size;i++) {
			System.out.println("enter the value of "+(i+1)+" th element");
			l1.add(sc.nextInt());
		}
		Collections.sort(l1);
		System.out.println("The descending order of the Linkedlist is:");
		for(i=size-1;i>=0;i--) {
			System.out.print(l1.get(i)+" ");
		}
		

	}

}
