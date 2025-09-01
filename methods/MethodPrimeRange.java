import java.util.Scanner;
class MethodPrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st=scn.nextInt();
		System.out.println("Enter ending range: ");
		int end=scn.nextInt();

		for (int i= st;i<=end;i++)
		{
			if (isPrime(i))
			{
				System.out.println(i);
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
