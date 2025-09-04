class D
{
	static
	{
		System.out.println("Static block");
	}

	{
		System.out.println("Non-Static block");
	}

	D()
	{
		System.out.println("Default Constructor");
	}
}
class Test3 
{
	public static void main(String[] args) 
	{
		System.out.println("main() starts");
		new D();
		new D();
	}
}
