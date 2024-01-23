package questions;

import java.util.Scanner;

public class Question3dowhile {

	public static void main(String[] args) {
		
		char yesorno;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("enter first number=");
			int firstnum=sc.nextInt();
			
			System.out.println("enter second number=");
			int secondnum=sc.nextInt();
			
			int sum= firstnum + secondnum;
			System.out.println("sum=" + sum);
			
			
			System.out.println("do you want to perform the operation again (Y/N)=");
			yesorno=sc.next().charAt(0);
		} 
		while(yesorno == 'Y' || yesorno == 'Y');
		
		sc.close();
	
		

	}

}