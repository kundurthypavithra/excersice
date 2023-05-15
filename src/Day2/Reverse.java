package Day2;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sentence that you want to reverse: ");
		String sentence;
		sentence=sc.nextLine();
		String[] sen=sentence.split(" ");
		System.out.print(sen.length);
		System.out.print("The reverse order of the sentence is: ");
		for(int i=(sen.length-1);i>=0;i--){
			System.out.print(sen[i]+" ");
		}
		
		}
		

}

