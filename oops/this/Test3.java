class Rectangle
{
	int length;
	int breadth;

	void initialize(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		System.out.println("Object initialized");
	}

	void display()
	{
		System.out.println("Length = "+length);
		System.out.println("Breadth = "+breadth);
	}
}
class Test3  
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle();
		r1.initialize(10,20);
		r1.display();
	}
}
