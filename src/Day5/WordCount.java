package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		s=sc.nextLine();
		String[] ar=s.split("\\s");
		System.out.println("The number of words in the statement are: "+ar.length);
		
	}

}
