package Day1;

import java.util.Scanner;

public class PandC {

	public static void main(String[] args) {
		int n,r,nf,nfac,nr=1,rf,rfac,rr=1,dr=1,df,dfac,i,f=1;
		char operation;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n ");
		n=sc.nextInt();
		System.out.print("Enter the value of r ");
		r=sc.nextInt();
		System.out.print("Choose p for permutation and c for combination " );
		operation=sc.next().charAt(0);
		for(i=1;i<=n;i++) {
			nf=i*f*nr;
			nr=nf;
		}
		nfac=nr;
		for(i=1;i<=r;i++) {
			rf=i*f*rr;
			rr=rf;
		}
		rfac=rr;
		for(i=1;i<=(n-r);i++) {
			df=i*f*dr;
			dr=df;
		}
		dfac=dr;
		if(operation=='p') {
			System.out.print("The required pernutation is "+(nfac/dfac));
		}
		if(operation=='c') {
			System.out.print("The required value of combination is "+(nfac/(rfac*dfac)));
		}
		
		
		
		
		

	}

}
