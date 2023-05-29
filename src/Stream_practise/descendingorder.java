package Stream_practise;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class descendingorder {

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
		List<Integer> l2=l1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("The descending order of the given list is: "+l2);

	}

}
