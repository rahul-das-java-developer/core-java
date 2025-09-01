class VarArgs 
{
	public static void main(String[] args) // p.s.v.main(String... args)
	{
		display(3);
		display(2,3,4,6,8,9,11,15,22,69);
	}
	static void display(int... a)
	{
		for (int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
