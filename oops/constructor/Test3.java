class B
{
	B(){
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int i)");
	}
}
class Test3
{
	public static void main(String[] args) 
	{
		new B();
		new B(10);
		
	}
}
