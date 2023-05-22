package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Removingduplicates {

	public static <E> void main(String[] args) {
		int size,i,j,count=0;
		System.out.println("Number of elements you would like to add");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		
		
		for(i=0;i<size;i++) {
			System.out.println("Enter the value of "+(i+1)+" th element");
			list.add(sc.nextInt());
		}
		for(i=0;i<list.size();i++) {
			
			for(j=i;j<list.size();j++) {
				
				if(list.get(i)==list.get(j)) {
					list.remove(j);
					continue;
				}
				else {
					continue;
				}
			}
		}
		System.out.println("The updated list after removing duplicates is:");
		System.out.println(list);


	}

}
