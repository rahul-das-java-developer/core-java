import java.util.Scanner;
class MethodArmstrong2Biggest
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a starting range: ");
		int st=scn.nextInt();
		System.out.println("Enter a ending range: ");
		int end=scn.nextInt();


		range(st,end);

	}
	static boolean isArmstrong(int num)
	{
		int temp=num;
		int count= 0;
		int sum=0;
		while (num!=0)		// int count=(num+"").length();
		{
			num/=10;
			count++;
		}
		num=temp;
		while (num!=0)
		{
			int digit=num%10;
			sum+=(int)Math.pow(digit,count);
			num/=10;
		}
		return sum==temp;
	}
	static void range(int st,int end)
	{
		int count=0;
		for (int i=end;i>=st;i--)
		{
			if (isArmstrong(i))
			{
				count++;
				if (count==2)
				{
					System.out.println("The second highest Armstrong num between "+st+" and "+end+" is: "+i);
					break;
				}
			}
		}
	}
}
