class A
{
	int i;
	void m1()
	{
		int i=1;
		System.out.println(i);
		System.out.println(this.i);
	}
	void m2()
	{
		System.out.println("M2 starts");
		this.m1();
		System.out.println("M2 ends");
	}

}
class Test1
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=10;
		a1.m2();
	}
}
