class MethodParameter 
{
	public static void main(String[] args) 
	{
		m1(3);					// here the args inside the m1 method is actual arguments
		m1(4+5+9);
		int n=5;
		m1(n);

		int a=5;
		m2(a);					
		System.out.println(a);	// a=5

		int i=0;		// i=0>1>2
		int j=0;		// j=0>2
		j=m3(++i)+m3(i++);
		System.out.println(i);
		System.out.println(j);


	}
	static void m1(int a)		// here the args inside the m1 method is formal arguments
	{
		System.out.println("a="+a);
	}

	static void m2(int a)		
	{
		System.out.println(a);	// a=5
		a*=2;
		System.out.println(a);	// a=10
	}

	static int m3(int a)
	{
		return a++;
	}
}
