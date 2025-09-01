import java.util.Scanner;
class NumAddPrimeEqualsPrime
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		
		for (int i=0;true;i++)
		{
			if (isPrime(i))
			{
				int j=i;

				if (num + j ==num+i)
				{
					if (isPrime(num+i))
					{

						System.out.println(num+" + "+j+" = "+(num+i));
						break;
					}
					else
					{
						System.out.println("There is no such prime number");
						break;
					}
				}
			}
		}
	}
	static boolean isPrime(int num)
	{
		if (num<=1)
		{
			return false;
		}
		for (int i=2;i<=num/2;i++)
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
