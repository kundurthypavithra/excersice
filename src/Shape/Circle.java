package Shape;

import java.util.Scanner;

public class Circle implements Shape{
	int radius;
	Scanner sc=new Scanner(System.in);
	@Override
	public void measurements() {
		System.out.println("Enter the radius of the circle: ");
		radius=sc.nextInt();
		
	}

	@Override
	public void Area() {
		System.out.println("The area of the circle with given radius is "+(3.14*radius*radius));
		
	}

	@Override
	public void perimeter() {
		System.out.println("The perimeter of the circle is: "+(2*3.14*radius));
		
	}

	

}
