package Multiple_Inheritance;

public class Tester implements Rectanglearea,Rectangleperimeter{
	public static void main(String[] args) {
		Tester obj=new Tester();
		obj.area(5, 15);
		obj.perimeter(5, 15);
	}

}
