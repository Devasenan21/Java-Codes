package oopspkg;

class parent
{
	public void job()
	{
		System.out.println("engineer");
	}
}

class Child extends parent
{
	@Override
	public void job()
	{
		System.out.println("doctor");
		super.job();
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		
		Child ob=new Child();
		ob.job();
		

	}

}
