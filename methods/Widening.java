class Widening 
{
	public static void main(String[] args) 
	{
		System.out.println(m1());
	}

	static double m1()
	{
		int a=4+5*6;
		return a;		// auto widening
	}
}
