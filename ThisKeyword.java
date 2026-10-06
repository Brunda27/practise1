package javaClass2;

public class ThisKeyword {

	int employeeid;
	double salary;
	String name;
	
	void empdetails(int employeeid,double salary,String name) 
	{
		this.employeeid =employeeid;
		this.salary =salary;
		this.name = name;

	}
	public static void main(String[] args) 
	{
		ThisKeyword s1 = new ThisKeyword();
		s1.empdetails(2, 5.5, "Arun");
		System.out.println(s1.employeeid);
		System.out.println(s1.salary);
		System.out.println(s1.name);
	}

}
