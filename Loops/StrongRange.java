import java.util.Scanner;
class StrongRange 
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
			
			int sum=0;
			int temp=i;
			while (i>0)
			{
				int fact=1;
				int digit=i%10;
				for (int j=1;j<=digit;j++)
				{
					fact*=j;
				}
				sum+=fact;
				i/=10;
			}
			i=temp;
			if (i==sum)
			{
				System.out.println(i);
			}
			
		}
	}
}
