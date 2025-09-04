class Pen
{	
	String color;

	void display()
	{
		Pen p1=new Pen();
		System.out.println(p1.color);
		System.out.println(color);
	}
}
	
class Test7
{
	public static void main(String[] args) 
	{
		Pen pen1=new Pen();
		pen1.color="Black";
		pen1.display();
		pen1.display();

		System.out.println("-------------");

		Pen pen2=new Pen();
		pen2.color="Red";
		pen2.display();

	}
}
