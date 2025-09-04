class D
{
	int i;
	int j;
	D()
	{
		j=20;
	}
	D(int i)
	{
		this();		// new D();  // but this will create another object for constructor D()
		this.i=i;
	}
}
class Test4
{
	public static void main(String[] args) 
	{
		D d1=new D(10);
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}
