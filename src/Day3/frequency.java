package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class frequency {
	public static <E> void main(String[] args) {
		int size,i,count=0;
		System.out.println("Number of elements you would like to add");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		
		
		for(i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		for(int j:list) {
			System.out.println("The frequency of the "+j+" is");
			System.out.println(Collections.frequency(list, j));
		}
	}

}
