import java.util.Scanner;
class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();	//153

		int count=0;
		int temp=num;	

		while (num>0)
		{
			num/=10;
			count++;	
		}

		num=temp;
		int sum=0;

		while (num>0)
		{
			int rem =num%10;	
			int fact=1;
			for (int i=1;i<=count;i++)
			{
				fact*=rem;
			}
			sum+=fact;
			num/=10;
		}
		if (sum==temp)
		{
			System.out.println(temp+" is an Armstrong Number.");
		}
		else 
		{
			System.out.println(temp+" is not an Armstrong Number.");

		}

	}
}
