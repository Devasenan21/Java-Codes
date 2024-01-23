package controlstatements;

public class Switch {

	public static void main(String[] args) {
		
		int a=7;
		
		switch(a)
		{
			case 1:System.out.println("monday");
			break;
			case 2:System.out.println("tuesday");
			break;
			case 3:System.out.println("wednesday");
			break;
			case 4:System.out.println("thursday");
			break;
			case 5:System.out.println("friday");
			break;
			case 6:System.out.println("saturday");
			break;
			case 7:System.out.println("sunday");
			break;
		
				default: System.out.println("invalid expression");
		}
		
				//prgm to check the size 29=small 42=medium 44=large 46=extra large
		
		
				int b=42;
				
				switch(b)
				{
				case 29:System.out.println("small");
				break;
				case 42:System.out.println("medium");
				break;
				case 44:System.out.println("large");
				break;
				case 46:System.out.println("extra large");
				break;
				
				default: System.out.println("unknown");
				}

	}

}




			





