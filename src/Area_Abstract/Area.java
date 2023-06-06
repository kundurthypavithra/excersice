package Area_Abstract;

import java.util.Scanner;

public class Area extends shape {

	void rectangle_area(int length, int width) {
		
		System.out.println("The area of rectangle is: "+(length*width));
	}

	void square_area(int length) {
		System.out.println("The area of square is: "+(length*length));
		
	}

	void circle_area(int radius) {
		System.out.println("The area of the circle is: "+(3.14*radius*radius));
		
	}

	

	

	
}
