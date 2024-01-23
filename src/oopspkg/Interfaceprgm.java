package oopspkg;


interface Cardetails
{
	public void acceleration();
	void speed();
}
	
	class Ford implements Cardetails
	{

		@Override
		public void acceleration() {
			
			System.out.println("ford acceleration");
		}

		@Override
		public void speed() {
			System.out.println("ford speed limit");
			
		}
		
	}
	
	class Honda implements Cardetails
	{

		@Override
		public void acceleration() {
			
			System.out.println("honda cars");
			
		}

		@Override
		public void speed() {
			
			System.out.println("car milage");
		}
		
	}
	
	public class Interfaceprgm {

		public static void main(String[] args) {
			
			Ford ob=new Ford();
			ob.acceleration();
			ob.speed();
			
			Honda ob1=new Honda();
			ob1.acceleration();
			ob1.speed();
			

		}

	}
