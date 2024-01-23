package questions;

import java.util.Scanner;

public class Counttotalnoofchar {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter charecters =" );
		
		String inputchar = sc.nextLine();
		
		int charCount = inputchar.length();
		System.out.println("Total no of characters =" + charCount);
		
		sc.close();
	}

}
