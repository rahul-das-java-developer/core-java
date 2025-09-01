import java.util.Scanner;
class Pattern12
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

		int count=0;
		for (int i=1;i<=num;i++)
		{
			if (i%2!=0)
			{
				count+=i;
				for (int j=1;j<=i;j++)
				{
					System.out.print(count+" ");
					count++;
				}
			}
			else
			{
				count+=i-1;
				for (int j=1;j<=i;j++)
				{
					System.out.print(count+" ");
					count--;
				}
			}
			System.out.println();

		}
	}
}
