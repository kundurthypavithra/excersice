package Bank;

import java.util.Scanner;

public class Operations implements BankAccount{
	int balance,depositAmount,withdrawAmount,accountNumber;
	String Name;
	Scanner sc= new Scanner(System.in);
	
	public void details() {
		System.out.println("Enter your Account number");
		accountNumber=sc.nextInt();
		System.out.println("Enter the name of the Account user:");
		Name=sc.next();
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount that you would like to deposit: ");
		depositAmount=sc.nextInt();
		System.out.println("Dear "+Name);
		System.out.println("Your registered Account Number: "+accountNumber+" has received a deposit of "+depositAmount+" Now you current balance is "+(balance+depositAmount));
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the amount that you would like to Withdraw: ");
		withdrawAmount=sc.nextInt();
		System.out.println("Dear "+Name);
		System.out.println("Your registered Account Number: "+accountNumber+" has deducted a withdraw amount of "+withdrawAmount+" Now you current balance is "+(balance-withdrawAmount));
		
	}

	

}
