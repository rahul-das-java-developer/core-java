class B
{
	public static void main(String[] args) 
	{
		m1();

		int i=m1();
		System.out.println("i= "+i);

		int j=m1()*3;
		System.out.println("j= "+j);

		System.out.println(m1());

		// For m2 method

		m2();

		int k=m2();
		System.out.println("k= "+k);

		int a=m2()*3;
		System.out.println("a= "+a);

		System.out.println(m2());

	}

	static int m1()
	{
		System.out.println("m1 printed");
		return 10;
	}
	static int m2()
	{
		System.out.println("m2 executed");
		return 10+30;
	}

}
