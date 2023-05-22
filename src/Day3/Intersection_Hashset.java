package Day3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Intersection_Hashset {

	public static void main(String[] args) {
		int size1,size2,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of first hashset");
		size1=sc.nextInt();
		HashSet<Integer> set1=new HashSet<>();
		for(i=0;i<size1;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th element"));
			set1.add(sc.nextInt());
		}
		System.out.println("Enter the size of second hashset");
		size2=sc.nextInt();
		HashSet<Integer> set2=new HashSet<>();
		for(i=0;i<size2;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th element"));
			set2.add(sc.nextInt());
		}
		System.out.println("The intersection elements of both sets are: ");
		set1.retainAll(set2);
		System.out.println(set1);
					
		}

	}
