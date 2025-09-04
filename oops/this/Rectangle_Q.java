class Rectangle_Q 
{
	int length;
	int breadth;
	int height;

	Rectangle_Q(int length, int breadth, int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}

	Rectangle_Q()
	{

	}

	Rectangle_Q(int n){
		this(n,n,n);
	}

	void display()
	{
		System.out.println("Length: "+length);
		System.out.println("Breadth: "+breadth);
		System.out.println("Height: "+height);
	}

	public static void main(String[] args) 
	{
		Rectangle_Q r1=new Rectangle_Q();
		r1.display();
		System.out.println("-------------------");

		Rectangle_Q r2=new Rectangle_Q(10);
		r2.display();
		System.out.println("-------------------");

		Rectangle_Q r3=new Rectangle_Q(5,10,20);
		r3.display();
		System.out.println("-------------------");

	}
}
