package oopspkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprgm {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream ip=new FileInputStream("D://Games");   //throws
		
		//run time exception
		
		try
		{
		int c=10/0;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());  //arithematic exception
		}
			System.out.println("HOI");
			
			try
			{
			
			String c = null;
			System.out.println(c.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("Exception details");  //null pointer exception
			}
				System.out.println("kooooi");
				
				
	}
}
