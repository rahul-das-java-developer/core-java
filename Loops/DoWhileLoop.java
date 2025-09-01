class DoWhileLoop 
{
	public static void main(String[] args) 
	{
		int n=2999;
		int sum=0;
		do
		{
			while (n>0)
			{
				sum+=n%10;
				n/=10;
			}
			n=sum;
			sum=0;
		}
		while (n>9);
		System.out.println("Sum is: "+n);
	}
}
