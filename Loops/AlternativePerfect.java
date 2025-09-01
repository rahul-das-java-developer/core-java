import java.util.Scanner;
class AlternativePerfect
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st=scn.nextInt();
		System.out.println("Enter ending range: ");
		int end=scn.nextInt();
		
		int count=0;
		for (int i=st;i<=end;i++)
		{
			int sum=0;
			for (int j=1;j<=i/2;j++)
			{
				if (i%j==0)
				{
					sum+=j;
				}
			}
			if (i>0 && sum==i)
			{
				count++;
				if (count%2!=0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
