
class DisplaySumNum
{
	public static void main(String[] args) 
	{
				
		System.out.println(displaySum(5));
	}

	static int displaySum(int i)
	{
		if (i==1)
		{
			return 1;
		}
		return i+displaySum(i-1);
	}
}
