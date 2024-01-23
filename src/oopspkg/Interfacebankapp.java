package oopspkg;

import java.util.Scanner;

interface bank
{
	public void accountdetails(String name);
	void balance();
	void withdraw();
	void deposit();
	
}

class SBI implements bank
{
	static String Bankname="SBI";
	int balance = 10000;
	int withdraw;
	int deposit;
	int accountno;
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void accountdetails(String name) {
		
		System.out.println("Enter acc no :");
		accountno=sc.nextInt();
		System.out.println("your name"+name+"\n"+"your account no"+accountno+"\n"+"your bank name"+Bankname);
		
	}

	@Override
	public void balance() {
		
		System.out.println(balance);
	
	}

	@Override
	public void withdraw() {
		
		System.out.println("Enter withdraw ammount :");
		withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("your final balance ="+ balance);
		
		
		
	}

	@Override
	public void deposit() {
		
		
		System.out.println("Enter amount for deposit :");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("your final balance ="+ balance);
		
	}
	
}

public class Interfacebankapp {

	public static void main(String[] args) {
		
		SBI ob=new SBI();
		ob.accountdetails("Devan");
		ob.balance();
		ob.withdraw();
		ob.deposit();
		

	}

}
