package controlstatements;

import java.util.Scanner;

public class Palindromwithscanner {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		
		System.out.println(a);
		 
		int rem;
		int rev=0;
		 
		 while(a>0)
			 {
			 rem=a%10;
			 rev=rev*10+rem;
			 a= a/10;
			 }
		 System.out.println(rev);
		 if(temp==rev)
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("not palindrome");
		 }

	}

}
