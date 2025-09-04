class A
{
	static int i;
	static void m1()
	{
		System.out.println(i);
	}
	void m2()
	{
		System.out.println(i);
	}
}
class Test1 
{
	public static void main(String[] args) 
	{
		A.i=10;
		A.m1();
		A a1=new A();
		a1.m2();
		A a2=new A();
		a2.m2();
	}
}
