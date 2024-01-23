package oopspkg;

class Family
{
	public void pranavam()
	{
		System.out.println("pranavam details");
	}
}

class Members extends Family
{
	public void child()
	{
		System.out.println("child details");
	}
}

public class Singlelevelinheritence {

	public static void main(String[] args) {
		
		Members c=new Members();  //object
		c.pranavam();
		c.child();
		

	}

}
