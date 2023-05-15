package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Second_smallest {

	public static void main(String[] args) {
		int size,i;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the equired lenth of array ");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++) {
			System.out.print("Enter the value of "+i+"th element value ");
			arr[i]=sc.nextInt();
			}
		Arrays.sort(arr);
		System.out.print("Your required second smallest element is "+arr[1]);
		

	}

}
