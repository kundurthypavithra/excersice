package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class reverse {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		s=sc.nextLine();
		ArrayList<String> l=new ArrayList<>();
		String[] ar=s.split("\\s");
		//method1
		Optional<String> l2=Arrays.stream(ar).reduce((a,b)->b+" "+a);
		System.out.println("The reverse order is: "+l2);
		//method2
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		//method3
		ArrayList<String> l1=new ArrayList<>();
		for(String j:ar) {
			l1.add(j);
		}
		Collections.reverse(l1);
		System.out.println();
		System.out.println(l1);
		
		

	}

}
