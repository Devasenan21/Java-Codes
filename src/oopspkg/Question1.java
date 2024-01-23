package oopspkg;

import java.util.Scanner;

public class Question1 {  //Q1

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows =");
		int rows = sc.nextInt();
		System.out.println("right angled triangle pattern= ");
			for(int i=1;i<=rows;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+"");
				}
			}
		System.out.println();
		
	}

}
