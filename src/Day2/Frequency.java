package Day2;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		int size,i,fr=0,num,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the equired lenth of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++) {
			System.out.print("Enter the value of "+i+"th element value:");
			arr[i]=sc.nextInt();
			}
		System.out.print("Enter the number you would like to know about:");
		num=sc.nextInt();
		for(i=0;i<size;i++) {
			if(num==arr[i]) {
				count=count+1;
			}
			else {
				continue;
			}
		}
		System.out.print("The frequency ofyour required number is:"+count);

}
}
