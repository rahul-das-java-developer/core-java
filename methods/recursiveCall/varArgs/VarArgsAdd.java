class VarArgsAdd
{
	public static void main(String[] args) // p.s.v.main(String... args)
	{
		
		System.out.println(add(2,3,4,6,8,9,11,15,22,69));
	}
	static int add(int... a)
	{
		int sum=0;
		for (int n:a)
		sum+=n;
		return sum;
	}
}
