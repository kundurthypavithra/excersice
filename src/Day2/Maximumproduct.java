package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Maximumproduct {

	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		size=sc.nextInt();
		int[] arr=new int[size];
		for(i=0;i<size;i++) {
			System.out.print("Enter the value of "+i+"th term: ");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("The maximum product value is: "+(arr[size-1]*arr[size-2]));

	}

}
