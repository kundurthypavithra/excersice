package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Onlyletters {

	public static void main(String[] args) {
		String s;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		s=sc.nextLine();
		List<Integer> l=new ArrayList<>();
		s=s.replaceAll("\\s", "");
		for(int i=0;i<s.length();i++) {
			int ch=(int)s.charAt(i);
			l.add(ch);
		}
		for(int j:l) {
			if(64<j && j<91) {
				count=count+1;
				continue;
			}
			else if(96<j && j<123){
				count=count+1;
				continue;
			}
			else {
				break;
			}
		}
		if(count==s.length()) {
			System.out.println("Yes this statement contains all alphabets only");
		}
		else {
			System.out.println("This string contains charecters that are other than alphabets");
		}


	}

}
