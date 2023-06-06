package Multiple_Inheritance;

public interface Rectanglearea {
	default void area(int len,int width) {
		System.out.println("The area of rectangle is: "+(len*width));
	}

}
