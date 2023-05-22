package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Frequency_count {

	public static <E> void main(String[] args) {
		int size,count=0,i,j;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Enter the number of elements you would like to add");
		size=sc.nextInt();
		for(i=0;i<size;i++) {
			System.out.println("enter your "+i+" th term");
			list.add(sc.nextInt());
			
		}
		System.out.println(list);

		for(i=0;i<list.size();i++) {
			
			System.out.println("value of i:"+list.get(i));
			
			for(j=0;j<list.size();j++) {
				
				System.out.println("value of j:"+list.get(j));
				
				if(list.get(i)==list.get(j)) {
					
					list.remove(list.get(i));
					count=count+1;
					System.out.println(list.get(i)+"frequency: "+count);
					
				}

				
				
			}
			System.out.println("The frequency of "+list.get(i)+" is "+count);
			
		}


	}

}
