import java.util.Scanner;
class ArmstrongRange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting num: ");
		int st=scn.nextInt();
		System.out.println("Enter ending range: ");
		int end=scn.nextInt();

		for (int i=st;i<=end;i++)
		{
			int count=0;
			int temp=i;
			while (i>0)
			{
				i/=10;
				count++;
			}

			i=temp;
			int sum=0;
			while (i>0)
			{
				int digit=i%10;
				int fact=1;
				for (int j=1;j<=count;j++)
				{
					fact*=digit;
				}
				sum+=fact;
				i/=10;

			}

			i=temp;
			if (sum==i)
			{
				System.out.println(i);
			}
		}

	}
}
