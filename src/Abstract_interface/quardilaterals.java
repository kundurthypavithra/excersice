package Abstract_interface;

import java.util.Scanner;

public abstract class quardilaterals implements Shape {
	Scanner sc=new Scanner(System.in);
	@Override
	public void rectangle() {
		int length,width,height;
		System.out.println("Enter the value of length: ");
		length=sc.nextInt();
		System.out.println("Enter the value of width: ");
		width=sc.nextInt();
		System.out.println("Enter the value of height: ");
		height=sc.nextInt();
		System.out.println("The area of rectangle: "+(length*width));
		System.out.println("The perimeter of rectangle is: "+(2*(length+width)));
		System.out.println("The volume of cuboid id: "+(length*width*height));
		System.out.println("-.. --- -. .     -. --- .--   . -. - . .-.    - .... .    -. . -..- -");
		
	}

	@Override
	public void square() {
		int side;
		System.out.println("Enter the side of square: ");
		side=sc.nextInt();
		System.out.println("The area of square is: "+(side*side));
		System.out.println("The perimeter of square is: "+(2*side));
		System.out.println("The volume of the cube is: "+(side*side*side));
		System.out.println("-.. --- -. .     -. --- .--   . -. - . .-.    - .... .    -. . -..- -");
		
	}
	
}
