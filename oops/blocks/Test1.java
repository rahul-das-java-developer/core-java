class A
{
	static 
	{
		System.out.println("Static block in A");
	}
	static void m1()
	{
		System.out.println("Static m1()");
	}
}
class Test1
{
	static
	{
		System.out.println("Static block in Test1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main() starts");
		A.m1();
		A.m1();
	}
}
