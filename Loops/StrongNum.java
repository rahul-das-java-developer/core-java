import java.util.Scanner;
class StrongNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		int temp=num;
		int sum=0;
		while (num>0)
		{
			int digit=num%10;
			int fact=1;
			for (int i=1;i<=digit;i++)
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;

		}
		num=temp;
		if (num==sum && num!=0)
		{
			System.out.println(num+" is a Strong Number.");
		}
		else 
		{
			System.out.println(num+" is not a Strong Number.");
		}
		
	}
}
