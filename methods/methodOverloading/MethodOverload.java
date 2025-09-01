class MethodOverload 
{
	public static void main(String[] args) 
	{
		m1();
		m1(10,20);
		m1(30,40,50.5);
		m1(60,70,80);
	//	m1(90.5,100,110);	// CTE: compiler cannot typecast narrowing automatically
	}

	public static void m1()
	{
		System.out.println("m1()");
	}
	public static void m1(int i,int j)
	{
		System.out.println("m1(int i, int j): "+i+","+j);
	}
	public static void m1(int i, int j, double d)
	{
		System.out.println("m1(int i, int j, double d): "+i+","+j+","+d);
	}
	
}
