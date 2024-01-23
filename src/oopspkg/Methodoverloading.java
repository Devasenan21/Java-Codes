package oopspkg;

public class Methodoverloading {

	public static void main(String[] args) {
		
		Methodoverloading ob5=new Methodoverloading();
		ob5.add();
		ob5.add(5.5, 10);
		ob5.add(5, 7.5);
		ob5.add(2, 4);
		
		

	}
	
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}

}
