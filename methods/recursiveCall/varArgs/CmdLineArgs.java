class CmdLineArgs 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (String s:args)
		{
			sum+= Integer.parseInt(s);	// pass args while execute
		}
		System.out.println(sum);
	}
}
