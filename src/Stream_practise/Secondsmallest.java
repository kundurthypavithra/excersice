package Stream_practise;

import java.util.Optional;
import java.util.Scanner;
import java.util.TreeSet;

public class Secondsmallest {

	public static void main(String[] args) {
		int size,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Treeset");
		size=sc.nextInt();
		TreeSet<Integer> set=new TreeSet<>();
		for(i=0;i<size;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th element"));
			set.add(sc.nextInt());
		}
		Optional<Integer> seclast=set.stream().skip(1).reduce((a,b)->a);
		System.out.println("The second last element of the tree list is: "+seclast);
	}

}

