import java.util.Scanner;
class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();

		boolean flag=true;
		for (int i=2;i<=num/2;i++)
		{
			if (num%i==0)
			{
				flag=false;
				break;
			}
		}
		if (num>1 && flag)
		{
			System.out.println(num+" is a prime number.");
		}
		else 
		{
			System.out.println(num+" is not a prime number.");

		}	
	}
}
