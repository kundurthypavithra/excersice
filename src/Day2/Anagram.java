package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		String sentence1,sentence2;
		int i,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first string: ");
		sentence1=sc.nextLine();
		sentence1=sentence1.replaceAll("\\s","");
		System.out.print("Enter the second string: ");
		sentence2=sc.nextLine();
		sentence2=sentence2.replaceAll("\\s","");
		char[] sen1=new char[sentence1.length()];
		char[] sen2=new char[sentence2.length()];
		for(i=0;i<sentence1.length();i++) {
			sen1[i]=sentence1.charAt(i);
		}
		Arrays.sort(sen1);
		for(i=0;i<sentence2.length();i++) {
			sen2[i]=sentence2.charAt(i);
		}
		Arrays.sort(sen2);
		if(sen1.length==sen2.length) {
			for(i=0;i<sen1.length;i++) {
				if(sen1[i]==sen2[i]) {
					count=count+1;
				}
				else {
					System.out.print("Sorry these strings are not anagram");
				}
				
				
			}
			if(count==sen1.length) {
				System.out.print("These strings are anagram");
			}
		}
		else {
			System.out.print("Sorry these strings are not anagram");
		}
		
		
	}
}
