package Day2;

import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		int size1,size2,i,j,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of first array: ");
		size1=sc.nextInt();
		System.out.print("Enter the value of second array: ");
		size2=sc.nextInt();
		int[] arr1=new int[size1];
		int[] arr2=new int[size2];
		for(i=0;i<size1;i++) {
			System.out.print("Enter the value of "+i+"th element: ");
			arr1[i]=sc.nextInt();
		}
		for(i=0;i<size2;i++) {
			System.out.print("Enter the value of "+i+"th element: ");
			arr2[i]=sc.nextInt();
		}
		for(i=0;i<size1;i++) {
			for(j=0;j<size2;j++) {
				if(arr1[i]!=arr2[j]) {
					continue;
				}
				else {
					System.out.print(arr1[i]+" ");
					count=count+1;
				}
			}
		}
		if(count>0) {
			System.out.print("the intersection of two arrays");
		}
		else {
			System.out.print("No intersections are available");
		}

	}

}
