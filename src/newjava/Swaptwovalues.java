package newjava;

public class Swaptwovalues {

	public static void main(String[] args) {
		
		//with temp
		
		int a=55,b=70,c;
		
		System.out.println("Before swaping value of a="+a + "\n"+"value of b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swaping value of a="+a + "\n"+"value of b="+b);
		
		System.out.println();
		
  
        //Q1
        System.out.println(a==23 && b==45);
        
        //Q2
        System.out.println(a<50);
        System.out.println(a<b);
		
        //Q3 , Without temp
        int d=20,e=30;
        System.out.println("before swaping value of d="+d + "\n"+"value of e="+e);
        
        d=d+e; //20+30=50
        e=d-e; //50-30=20
        d=d-e; //50-20=30
        
        System.out.println("After swaping swaping value of d="+d + "\n"+"value of e="+e);
        
        //Q4
        
        int f=17,g;
        int secondDigit=(a/10)%10;
        
        System.out.println("second degit of"+ f + "is"+ secondDigit);
	}

}
