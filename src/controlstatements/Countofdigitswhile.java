package controlstatements;

public class Countofdigitswhile {

	public static void main(String[] args) {
		
		//find count of number 5678
		
		int i=5678;
		int count=0;
		
		while(i>0)
		{
			i=i/10;
			count++;
		}
			System.out.println("count="+ count);

	}

}
