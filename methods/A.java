class A
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}

	static void m1()
	{
		System.out.println("m1 starts");
		for (int i=1;i<=10;i++)
		{
			System.out.println("i= "+i);
			if (i%3==0)
			{
				return;
			}
		}
		System.out.println("m1 ends");
		
	}
}
