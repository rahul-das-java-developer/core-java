import java.util.Scanner;
class AutomorphicNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		int absNum=0;
		if (num<0)
		{
			absNum=~num+1;
		}
		//	System.out.println(absNum);

		int temp=num;
		int square=num*num;
		int i=1;

		while(temp<0 || temp>0)	
		{
			temp/=10;
			i*=10;
		}
		if (absNum==square%i || num==square%i)
		{
			System.out.println(num+" is a Automorphic number.");
		}
		else
		{
			System.out.println(num+" is not a Automorphic number.");
		}

	}
}
