class Circle
{
	int radius;

	void initialize(int r)
	{
		radius=r;
	}
	void area()
	{
		System.out.println("Area = "+(3.14*radius*radius));
	}
	void display()
	{
		System.out.println("Radius = "+radius);
	}
}
class Test9
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		c1.display();
		c1.initialize(10);
		c1.display();
		c1.area();

	}
}
