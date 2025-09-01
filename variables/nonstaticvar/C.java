class C 
{
	static int i;
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.i=10;
		System.out.println(c1.i);	//10

		C c2 = new C();
		c2.i=25;
		System.out.println(c2.i);	// 25

		System.out.println(c1.i);	//25	// for entire class only one copy of memory is allocated for static var
		System.out.println(C.i);	//25
		System.out.println(i);	//25

	}
}
