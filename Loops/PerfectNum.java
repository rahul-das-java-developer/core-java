import java.util.Scanner;
class PerfectNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= scn.nextInt();

		int sum=0;
		for (int i=1;i<=num/2 ;i++ )
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}
		if (num>0 && num==sum)
		{
			System.out.println(num+" is a perfect number.");
		}
		else 
		{
			System.out.println(num+" is not a perfect number.");

		}
	}
}
