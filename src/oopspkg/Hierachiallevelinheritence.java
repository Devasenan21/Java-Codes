package oopspkg;

class Animal1
{
	public void lion()
	{
		System.out.println("lion details");
	}
}

class Tiger extends Animal1
{
	public void tigermethd()
	{
		System.out.println("tiger details");
	}
}

class Hippo extends Animal1
{
	public void hippomethd()
	{
		System.out.println("hippo details");
	}
}


public class Hierachiallevelinheritence {

	public static void main(String[] args) {
		
		Tiger ob1=new Tiger();
		ob1.lion();
		ob1.tigermethd();
		
		Hippo ob2=new Hippo();
		ob2.lion();
		ob2.hippomethd();
		

	}

}
