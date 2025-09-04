class C
{
	static int i;
	static
	{
		i=10;
	}
}
class Test2
{
	public static void main(String[] args) 
	{
		System.out.println(C.i);
	}
}
