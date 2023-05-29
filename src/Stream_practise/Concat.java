package Stream_practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat {

	public static void main(String[] args) {
		int i,size1,size2;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		System.out.println("Enter the size of array1: ");
		size1=sc.nextInt();
		System.out.println("Enter the size of array2");
		size2=sc.nextInt();
		for(i=0;i<size1;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th value of array1"));
			list1.add(sc.nextInt());
		}
		for(i=0;i<size2;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th value of array2"));
			list2.add(sc.nextInt());
		}
		List<Integer> l2=Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
	}

}
