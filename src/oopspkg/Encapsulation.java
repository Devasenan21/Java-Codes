package oopspkg;

class Emp
{
	private String empname;
	private String empdisignation;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdisignation() {
		return empdisignation;
	}
	public void setEmpdisignation(String empdisignation) {
		this.empdisignation = empdisignation;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		
		Emp ob=new Emp();
		ob.setEmpname("dev");
		ob.setEmpdisignation("tester");
		System.out.println(ob.getEmpname());
		System.out.println(ob.getEmpdisignation());
		
		

	}

}
