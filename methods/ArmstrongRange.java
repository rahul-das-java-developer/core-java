import java.util.Scanner;
class ArmstrongRange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st = scn.nextInt();
		System.out.println("Enter ending range: ");
		int end=scn.nextInt();

		range(st,end);
		
	}
	static boolean isArmstrong(int num)
	{
		int temp=num;
		int count=(num+"").length();
		int sum=0;
		while (num!=0)
		{
			sum+=(int)Math.pow(num%10,count);
			num/=10;
		}
		num=temp;
		return sum==num;
	}
	static void range(int st, int end)
	{
		for (int i=st;i<=end;i++)
		{
			if (isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}
}
