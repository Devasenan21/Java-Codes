package newjava;

public class Operators {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Arithematic operators
		
				int a=20,b=10;
				System.out.println("a+b="+(a+b));
				System.out.println("a-b="+(a-b));
				System.out.println("a*b="+(a*b));
				System.out.println("a/b="+(a/b));
				System.out.println("a%b="+(a%b)); 
	    
		//Assignment operators
		
		
				int c=a;
				System.out.println(a+=b); //30
				System.out.println(a-=b); //20
				System.out.println(a*=b); //200
				System.out.println(a/=b); //20
				
		//Relational operators
				
				System.out.println(a==b); //false
				System.out.println(a<b); //false
				System.out.println(a>b); //true
				System.out.println(a!=b); //true
				
		//Logical operators
				
	//		A		B		A&&B		A||B		!A		!B			
	//		0		0	
	//			
	//			
				
				
				String username="abc";
				String pswrd="abc123";
				
				System.out.println(username=="abc"&& pswrd=="abc123"); //true
				System.out.println(username=="abc"|| pswrd=="abc123"); //true
				System.out.println(!(username=="abc")); //false
				
		//Unary operators
				
				int c1=10,c2=4;
				
				System.out.println(c1++);  //10
				System.out.println(c1);    //11
				System.out.println(++c1);  //12
				
				
		//Ternary operators
				
				String  v=c1>c2?"c1 is greater":"c2 is greater";
				System.out.println(v);  //c1 is greater
				
		
	}

}
