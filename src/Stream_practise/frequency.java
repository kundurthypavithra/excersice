package Stream_practise;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

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
		Map<Integer, Long> result=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result);

}
}

