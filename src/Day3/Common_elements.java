package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Common_elements {
	public static <E> void main(String[] args) {
		int i,j,size1,size2;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		System.out.println("Enter the size of first array list");
		size1=sc.nextInt();
		System.out.println("Enter the size of second array list");
		size2=sc.nextInt();
		ArrayList<Integer> list3=new ArrayList<>();
		
		for(i=0;i<size1;i++) {
			System.out.println("enter the value of "+(i+1)+" th element of array1");
			list1.add(sc.nextInt());
			
		}
		for(i=0;i<size2;i++) {
			System.out.println("enter the value of "+(i+1)+" th element of array2");
			list2.add(sc.nextInt());
		}
		System.out.println("The common element of the both arrays are: ");
		for(i=0;i<size1;i++) {
			for(j=0;j<size2;j++) {
				if(list1.get(i)==list2.get(j)) {
					
					list3.add(list1.get(i));
				}
				else {
					continue;
				}
			}
		}
		if(list3.size()!=0) {
			System.out.println(list3);
		}
		else {
			System.out.println("Sorry no common elements are found");
		}
		
	}

}
