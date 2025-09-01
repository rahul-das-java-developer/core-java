import java.util.Scanner;
class NextArmstrong 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

		if (isArmstrong(num))
		{
			num+=1;
		}
		for (int i=num;true;i++)
		{
			if (isArmstrong(i))
			{
				System.out.println(i);
				break;
			}
		}


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
}
