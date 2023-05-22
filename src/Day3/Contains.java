package Day3;

import java.util.LinkedList;
import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		int size,i,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of linkedlist");
		size=sc.nextInt();
		LinkedList<Integer> l1=new LinkedList<>();
		for(i=0;i<size;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th element"));
			l1.add(sc.nextInt());
		}
		System.out.println("Enter the number that you would like to check");
		num=sc.nextInt();
		if(l1.contains(num)) {
			System.out.println("Yes the element is present");
		}
		else {
			System.out.println("Sorry the element is not available");
		}

	}

}
