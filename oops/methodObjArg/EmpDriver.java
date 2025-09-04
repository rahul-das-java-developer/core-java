package com.oops.methodObjArg;

class Employee {
	String name;
	int age;
	int empId;
	
	public Employee(String name, int age, int empId)
	{
		this.name=name;
		this.age=age;
		this.empId=empId;
		
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("EmpId: "+empId);
	}
}

public class EmpDriver {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Siri",26,8);
		Employee e2=new Employee("Alexa",21,1);
		//Employee e3=new Employee(e2);
		
		e1.display();
		e2.display();

	}

}
