class C 
{
	static int i=1;
	public static void main(String[] args) 
	{
		System.out.println(i);	// refers static var
		int i =20;
		System.out.println(i);	// refers local var
		System.out.println(C.i);
	}
}
