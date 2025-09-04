class Student
{
	String name;
	int age;
	int id;

	Student(String name)
	{
		this.name=name;

	}
	Student(String name,int age)
	{
		this(name);
		this.age=age;
	}
	Student(String name,int age,int id)
	{
		this(name,age);
		this.id=id;
	}
	void display()
	{
		System.out.println("Student name is: "+name);
		System.out.println("Student age is: "+age);
		System.out.println("Student Id is: "+id);
	}

	public static void main(String[] args) 
	{
		Student s1=new Student("Rahul",22,1001);
		s1.display();
	}
}
