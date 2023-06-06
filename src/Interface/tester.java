package Interface;

public class tester {

	public static void main(String[] args) {
		Car1 obj1=new Car1();
		Car2 obj2=new Car2();
		System.out.println("The properties of Car1 are: ");
		obj1.setCurrentSpeed(60);;
		obj1.accelarator(10);
		obj1.Break(5);
		obj1.horn();
		System.out.println("The properties of Car2 are: ");
		obj2.currentSpeed=60;
		obj2.accelarator(15);
		obj2.Break(3);
		obj2.horn();

	}

}
