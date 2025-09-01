class Test1 
{
	public static void main(String[] args) 
	{
		int a=15;
		if(a%2!=0)		// No matter how many condition is ture java only execute first condition and comes outside the if-else condition
		{
			System.out.println("if block is executed.");
		}
		else if (a%3==0)
		{
			System.out.println("else if block is executed.");
		}
		else if (a>10)
		{
			System.out.println("last else if block is executed.");
		}
		
	}
}
