package questions;

import java.util.Scanner;

public class Revercestring2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = sc.nextLine();

		       
		StringBuilder reversedString = new StringBuilder(inputString).reverse();

		System.out.println("Reversed string: " + reversedString);
		
		sc.close();
	}

}
