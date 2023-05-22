package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Max_hashset {

	public static void main(String[] args) {
		int size,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Hashset");
		size=sc.nextInt();
		HashSet<Integer> set=new HashSet<>();
		for(i=0;i<size;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th element"));
			set.add(sc.nextInt());
		}
		ArrayList<Integer> list=new ArrayList<>(set);
		Collections.sort(list);
		System.out.println("The maximum value in the set is: ");
		System.out.println(list.get(size-1));

	}

}
