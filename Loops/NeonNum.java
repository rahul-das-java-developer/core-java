import java.util.Scanner;
class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();

		int square=num*num;
		int sum=0;
		while (square>0)
		{
			sum+=square%10;
			square/=10;
		}
		if (sum==num)
		{
			System.out.println(num+" is a Neon number.");
		}
		else
		{
			System.out.println(num+" is not a Neon number.");
		}
	}
}
