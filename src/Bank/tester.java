package Bank;

public class tester {
	public static void main(String[] args) {
		Operations pavithra=new Operations();
		pavithra.balance=10000;
		pavithra.details();
		pavithra.deposit();
		Operations raju=new Operations();
		raju.balance=25000;
		raju.details();
		raju.withdraw();
		
	}

}
