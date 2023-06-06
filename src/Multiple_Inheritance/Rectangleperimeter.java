package Multiple_Inheritance;

public interface Rectangleperimeter {
	default void perimeter(int len,int width) {
		System.out.println("The perimeter of the rectangle is: "+(2*(len+width)));
	}

}
