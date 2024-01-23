package oopspkg;

class Animal
{
	public void Dog()
	{
		System.out.println("Dog details");
	}
}

class Fish extends Animal
{
	public void chaala()
	{
		System.out.println("chaala details");
	}
}

class Birds extends Fish
{
	public void crow()
	{
		System.out.println("crow details");
	}
}

public class Multilevelinheritence {

	public static void main(String[] args) {
		
		Birds ob=new Birds();
		ob.Dog();
		ob.crow();
		ob.chaala();
		

	}

}
