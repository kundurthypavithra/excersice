package Day5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharecters {

	public static void main(String[] args) {
		String s;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		s=sc.nextLine();
		Map map=new TreeMap<>();
		s=s.replaceAll("\\s", "");
		for(int i=0;i<s.length();i++) {
			count=0;
			for(int j=0;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					count=count+1;
					continue;
				}
				else {
					continue;
				}
			}
			map.put(s.charAt(i), count);
		}
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println("The frequency of "+entry.getKey()+" is "+entry.getValue());
	}

}
}
