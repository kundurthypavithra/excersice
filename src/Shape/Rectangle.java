package Shape;

import java.util.Scanner;

public class Rectangle implements Shape {
	int length,width;
	Scanner sc= new Scanner(System.in);

	@Override
	public void measurements() {
		System.out.println("Enter the length of rectangle: ");
		length=sc.nextInt();
		System.out.println("Enter the width of the rectangle: ");
		width=sc.nextInt();
		
	}

	@Override
	public void Area() {
		System.out.println("Area of the rectangle with given measurements is: "+(length*width));
		
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of the rectangle with given measurements is: "+2*(length+width));
		
	}

}
