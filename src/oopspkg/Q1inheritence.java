package oopspkg;

class Member
{
	String name;
	int age;
	int phno;
	String address;
	int salary;
	
	public void membermthd()
	{
		System.out.println("name="+name + " age="+age+" phno="+phno+" address="+address+" salary="+salary);
		
	}
}
	
	class Employee5 extends Member
	{
		String datamemberspecification="engineer";
	}
	
	class Manager extends Member
	{
		String department="Developer";
	}

public class Q1inheritence {

	public static void main(String[] args) {
		
		Employee5 ob=new Employee5();
		ob.name="devan";
		ob.age=23;
		ob.phno=987654327;
		ob.address="dev villa";
		ob.salary=8000;
		ob.membermthd();
		System.out.println(ob.datamemberspecification);
		
		Manager ob1=new Manager();
		ob1.name="lolan";
		ob1.age=25;
		ob1.phno=987656763;
		ob1.address="lol villa";
		ob1.salary=5000;
		ob1.membermthd();
		System.out.println(ob1.department);
		
		

	}

}
