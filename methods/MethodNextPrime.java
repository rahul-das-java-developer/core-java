import java.util.Scanner;
class MethodNextPrime 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		
		if (isPrime(num))
			{
				num+=1;
			}

		for (int i=num;true;i++)
		{
			
			if (isPrime(i))
			{
				System.out.println(i);
				break;
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
