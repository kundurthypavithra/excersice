package Rectangle;

import java.util.Scanner;

public class Implementations implements Rectangle{
	int length,width;
	Scanner sc= new Scanner(System.in);

	@Override
	public void measurements() {
		System.out.println("enter the length of rectangle: ");
		length=sc.nextInt();
		System.out.println("Enter the width of the rectangle: ");
		width=sc.nextInt();
		
		
		
	}

	@Override
	public void area() {
		System.out.println("The area of the rRectangle is: "+(length*width));
		
	}

	@Override
	public void perimeter() {
		System.out.println("The perimeter of the rectangle is: "+2*(length+width));
		
	}

}
