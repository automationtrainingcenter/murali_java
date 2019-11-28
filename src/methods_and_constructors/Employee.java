package methods_and_constructors;

public class Employee {
	
	int id;
	String name;
	String designation;
	double salary;
	long aadharNum;
	String voterId;

//	// default constructor
//	public Employee() {
//		id = 100;
//		name = "surya";
//		designation = "tester";
//		salary = 50000;
//		aadharNum = 0l;
//		voterId = "123abc";
//	}
	
	
	// parameterized constructor
	public Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	// parameterized constructor with aadhar num
	public Employee(int id, String name, String designation, double salary, long aadharNum) {
		this(id, name, designation, salary);
		this.aadharNum = aadharNum;
		
	}
	
	// parameterized constructor with voterid
	public Employee(int id, String name, String designation, double salary, String voterId) {
		this(id, name, designation, salary);
		this.voterId = voterId;
	}	
	
	public void display() {
		System.out.println("id = "+id+"\tname = "+name+"\tdesignation = "+designation+"\tsalary = "+salary+"\taadahar num = "+aadharNum+"\tvoter id = "+voterId);
	}
	
	
	public static void main(String[] args) {
		Employee e1 =new Employee(101, "anil", "developer", 65000);
		Employee e2 =new Employee(102, "ravi", "admin", 55000, "abc11223");
		Employee e3 =new Employee(103, "sunil", "tester", 50000, 987112346754l);
		e1.display();
		e2.display();
		e3.display();
		
		e1.salary = 15000;
		e1.designation = "jr developer";
		e1.display();
	}
	
}
