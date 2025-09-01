import java.util.Scanner;
class AutomorphicSir 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();
		int temp=num;

		int sq=num*num;
		boolean flag=true;
		while (num>0)
		{
			if (num%10!=sq%10)
			{
				flag=false;
				break;
			}
			num/=10;
			sq/=10;
		}
		num=temp;
		if (flag)
		{
			System.out.println(num+" is a Automorphic number.");
		}
		else
		{
			System.out.println(num+" is not a Automorphic number.");
		}
	}
}
