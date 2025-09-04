class Rectangle
{
	int length;
	int breadth;
	static int count=0;
	Rectangle(int l,int b)
	{
		initialize(l,b);
		count++;
	}
	void initialize(int l,int b)
	{
		length=l;
		breadth=b;
	}
}
class Test5
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(10,20);
		System.out.println("Length is: "+r1.length);
		System.out.println("Breadth is: "+r1.breadth);
	}
}
