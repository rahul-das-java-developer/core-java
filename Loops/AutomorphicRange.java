import java.util.Scanner;
class AutomorphicRange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st=scn.nextInt();
		System.out.println("Enter ending range: ");
		int end=scn.nextInt();
		

		for (int i=st;i<=end;i++)
		{
			int temp=i;
			int sq=i*i;
			boolean flag=true;
			while (i>0)
			{
				if (i%10 != sq%10)
				{
					flag=false;
					break;
				}
				i/=10;
				sq/=10;
			}
			i=temp;
			if (flag)
			{
				System.out.println(i);
			}
		}
	}
}
