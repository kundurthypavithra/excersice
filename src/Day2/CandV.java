package Day2;

import java.util.Scanner;

public class CandV {

	public static void main(String[] args) {
		int i,ccount=0,vcount=0;
		String sentence;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your statement");
		sentence=sc.nextLine();
	
		char[] sen=new char[sentence.length()];
		
		for(i=0;i<sentence.length();i++) {
			sen[i]=sentence.charAt(i);
		}
		for(i=0;i<sen.length;i++) {
			if((sen[i]=='a')||(sen[i]=='e')||(sen[i]=='i')||(sen[i]=='o')||(sen[i]=='u')) {
				vcount=vcount+1;
			}
			if(sen[i]==' ') {
				continue;
			}
			else {
				ccount=ccount+1;
			}
		}
		System.out.print("The Vowels count is: "+vcount+" and the consonant count is: "+ccount);

}
}
