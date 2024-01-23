package arrayprgms;

import java.util.Scanner;

public class Methodprgm {

	public static void main(String[] args) {
		
		Methodprgm ob=new Methodprgm();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers=");
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		ob.add();
		int subanswer= ob.sub();
		System.out.println(subanswer);
		ob.mul(v1, v2);
		
		System.out.println(ob.div(v1,v2));
		

	}
	//method without parameter and without return type
	
	public void add()
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	}
	//method with return type and without paramether
	
	public int sub()
	{
		int a=40,b=20,c;
		c=a-b;
		return c;
	}
	//method without return type and with parameter
	
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	//method with return type and with parameter
	
	public double div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
		return c;
	}

}
