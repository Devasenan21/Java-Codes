package controlstatements;

public class Armstrongnumberwhile {

	public static void main(String[] args) {
		
		int n=153;
		int temp=n;
		int r,s=0;
		
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		if(temp==s)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}

	}

}
