package Stream_practise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

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
		Integer max=set.stream().sorted().reduce((first,second)->second).get();
		System.out.println("The Largest number among the set is: "+max);

	}

}
