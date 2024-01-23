package arrayprgms;

import java.util.Scanner;

public class Usernamepaswrd {

	public static void main(String[] args) {
		
		String[][] a= new String[3][2];
		System.out.println("Enter usename and paswrd: ");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.next();
			}
		}
		System.out.println("Entered username and passwrd:");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
