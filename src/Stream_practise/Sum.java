package Stream_practise;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int size,i;
		System.out.println("Number of elements you would like to add");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		
		
		for(i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
		System.out.println("The sum all the elements in list is: "+sum);

	}

}
