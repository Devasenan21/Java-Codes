package controlstatements;

public class Nestedby {

	public static void main(String[] args) {
		
		int a=10;
				if(a%5==0)
				{
				
					if(a%11==0)
					{
						System.out.println("also divisible by 11 and 5" );
					}
					else
					{
						System.out.println("divisible by 5 but not 11");
					}
				}
				else
					{
						System.out.println("not divisible by 5 and 11");
					}
					
								//Nested if
	}

}
