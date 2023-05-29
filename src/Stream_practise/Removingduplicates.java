package Stream_practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Removingduplicates {

	public static void main(String[] args) {
		int size,i,j,count=0;
		System.out.println("Number of elements you would like to add");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		
		
		for(i=0;i<size;i++) {
			System.out.println("Enter the value of "+(i+1)+" th element");
			list.add(sc.nextInt());
		}
		Set<Integer> result=list.stream().collect(Collectors.toSet());
		System.out.println(result);

	}

}
