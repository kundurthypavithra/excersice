package Calculator;

public class operations implements calculator{
	int num1,num2;

	@Override
	public void addition() {
		System.out.println("The addition of the two numbers is: "+(num1+num2));
		
	}

	@Override
	public void substraction() {
		System.out.println("The substraction of the two numbers is: "+(num1-num2));
		
	}

	@Override
	public void multiplication() {
		System.out.println("The multiplication of the two numbers is: "+(num1*num2));
		
	}

	@Override
	public void division() {
		System.out.println("The division of two numbers is: "+(num1/num2));
		
	}

}
