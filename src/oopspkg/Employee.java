package oopspkg;

public class Employee {
	
	int empid;
	String empname;
	
	public Employee(int empid, String empname) {
		
		this.empid=empid;
		this.empname=empname;
	}
	
	public void display()
	{
		System.out.println("empid:"+empid);
		System.out.println("epmname:"+empname);
	}
	

	public static void main(String[] args) {
		
		Employee emp=new Employee(101,"arya");
		emp.display();
		Employee emp2=new Employee(102,"devan");
		emp2.display();
		Employee emp3=new Employee(103,"vivek");
		emp3.display();
		

	}

}
