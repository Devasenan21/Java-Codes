package oopspkg;

import java.util.Scanner;

public class Question2 {  //Q2

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.println("The numbers are in increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("The numbers are in decreasing order");
        } else {
            System.out.println("The number is in Neither increasing nor decreasing order");
        }
        scanner.close();
	}

}
