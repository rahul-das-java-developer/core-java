package com.oops.methodObjArg;
class Student{
	String name;
	int age;
	int sid;
	
	public Student(String name, int age, int sid) {
		this.name=name;
		this.age=age;
		this.sid=sid;
	}
	
	static void changeName(Student s) {
		s.name="Tarak";
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Student Id: "+sid);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Student s1=new Student("Ram",27,1);
		Student s2=new Student("Rahul",21,2);
		
		s1.display();
		Student.changeName(s2);
		s1.display();
		s2.display();		
		
	}

}
