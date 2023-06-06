package Abstract_interface;

import java.util.Scanner;

public class Circle extends quardilaterals{
	Scanner sc= new Scanner(System.in);
	@Override
	public void circle() {
		int radius;
		System.out.println("Enter the radius of circle: ");
		radius=sc.nextInt();
		System.out.println("The area of circle is: "+(3.14*radius*radius));
		System.out.println("The perimeter of circle is: "+(2*3.14*radius));
		
	}

}
