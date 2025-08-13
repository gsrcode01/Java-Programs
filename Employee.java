package lab1;


public class Employee {
	String name;
	String id;
	double salary;
	//Employee deatils
	Employee(String name,String id, int salary ){
		this.name = name;
		this.id = id;
		this.salary= salary;
	}
	//displaying details
	void display_details() {
		System.out.println("Employee name: "+this.name);
		System.out.println("Employee ID: "+this.id);
		System.out.println("Employee Salary: "+this.salary);

	}
	//salary increment
	void increased_salary(int percentage) {
		double  increment = (percentage*this.salary)/100;
		this.salary=increment+this.salary;
		System.out.println("Incremented salary of the employee is "+this.salary );
	}
	


public static void main(String []args) {
	//Employee deatails
	Employee e1 =new Employee("Girdhar","NNM24IS086",10000);
	Employee e2 =new Employee("Divith","NNM24IS079",20000);
	//intial Details
	//brute force method
	//Employee 1
	/*System.out.println(e1.name +" Initial deatils :");
	System.out.println("Employee name is "+e1.name);
	System.out.println("Employee ID is "+e1.id);
	System.out.println("Employee salary is "+e1.salary);*/
	e1.display_details();
	
	//Employee 2
	/*System.out.println(e2.name +" Initial deatils :");
	System.out.println("Employee name is "+e2.name);
	System.out.println("Employee ID is "+e2.id);
	System.out.println("Employee salary is "+e2.salary);*/
	e2.display_details();
	
	//increasing salary
	e1.increased_salary(20);
	e2.increased_salary(10);
	//final deatails
	//Employee 1
		/*System.out.println(e1.name +" Initial deatils :");
		System.out.println("Employee name is "+e1.name);
		System.out.println("Employee ID is "+e1.id);
		System.out.println("Employee salary is "+e1.salary);*/
		e1.display_details();
		//Employee
		/*
		System.out.println(e2.name +" Initial deatils :");
		System.out.println("Employee name is "+e2.name);
		System.out.println("Employee ID is "+e2.id);
		System.out.println("Employee salary is "+e2.salary);*/
		e2.display_details();
		
		
		
	
}}
