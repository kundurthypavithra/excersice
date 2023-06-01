package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicatewords {

	public static void main(String[] args) {
		String s;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		s=sc.nextLine();
		ArrayList<String> l=new ArrayList<>();
		String[] ar=s.split("\\s");
		Map<String, Long> result=Arrays.stream(ar).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("The details of the strings are:"+result);
		
		
	}
}
