package Day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		char[] word;
		int len,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string you want to check for ");
		word=sc.next().toCharArray();
		len=word.length;
		if(len%2==0) {
			for(i=1;i<(len/2);i++) {
				if(word[i-1]==word[len-i]) {
					count=count+1;
					
				}
				
			}
			if(count==(len/2)) {
				System.out.print("Wow!! This is a palindrome");
			}
			else {
				System.out.print("Oops!! This is not a palindrome");
				
			}
			
		}
		if(len%2!=0) {
			for(i=1;i<=(len/2);i++) {
				if(word[i-1]==word[len-i]) {
					count=count+1;
				}
			}
			if(count==(len/2)) {
				System.out.print("Wow!! This is a palindrome");
			}
			else {
				System.out.print("Oops!! This is not a palindrome");
				
			}
		}
	}
}

