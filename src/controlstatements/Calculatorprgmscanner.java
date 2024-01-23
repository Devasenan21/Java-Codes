package controlstatements;

import java.util.Scanner;

public class Calculatorprgmscanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number=");
		int num1=sc.nextInt();
		
		System.out.println("enter second number=");
		int num2=sc.nextInt();
		
		System.out.println("select operations (+, -, *, /)=");
		char operation= sc.next().charAt(0);
		
		int r = 0;
		
		switch(operation)
		{
		case '+':
		r = num1+num2;
		break;
		
		case '-':
		r = num1-num2;
		break;
		
		case '*':
		r = num1*num2;
		break;
		
		case '/':
		if(num2 !=0)
			{
				r =num1/num2;
			}
		else
			{
			System.out.println("can't devide by zero");
			}
		break;
		default:
			System.out.println("invalid operation");
			return;
		}
				
		System.out.println("result="+ r);
	}

}
