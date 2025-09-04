class A
{
	void A()		// Its a method, java adds default constructor
	{
		System.out.println("A()");
	}
}
class Test2 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.A();		// calling a method
		
	}
}
