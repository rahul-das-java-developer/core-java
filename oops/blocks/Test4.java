class E
{
	{
		System.out.println("Non-Static block");
	}
	E()
	{
		System.out.println("E() constructor");
	}
	E(int i)
	{
		System.out.println("E(int) constructor");
	}
}
class Test4 
{
	public static void main(String[] args) 
	{
		new E();
		System.out.println("--------------------");
		new E(10);
	}
}
