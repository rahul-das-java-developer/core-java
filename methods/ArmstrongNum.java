import java.util.Scanner;
class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

		if (isArmstrong(num))
		{
			System.out.println(num+" is an Armstrong Number");
		}
		else 
		{
			System.out.println(num+" is not an Armstrong Number");
		}

	}

	static boolean isArmstrong(int num)
	{
		int temp=num;
		int count=0;
		while (num>0)
		{
			num/=10;
			count++;
		}
		num=temp;
		int sum=0;
		while (num>0)
		{
			int fact=1;
			for (int i=1;i<=count;i++)
			{
				fact*=num%10;
			}
			sum+=fact;
			num/=10;
		}
		num=temp;

		return num==sum;
	}
}
