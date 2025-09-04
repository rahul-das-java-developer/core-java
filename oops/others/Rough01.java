class A1
{
	 int i=101;
	 int j=106;
	A1()
	{
		System.out.println("A1()");
	}
	A1(int i)
	{
		//int k=11;
		//int m=15;
		System.out.println("A1(int i)"+i);
	}

}
class Rough01 
{
	public static void main(String[] args) 
	{
		A1 a=new A1();
		System.out.println(a.i);
		System.out.println(a.j);

		a=null;
		
		a=new A1(10);
		System.out.println(a.i);
		System.out.println(a.j);
	}
}
