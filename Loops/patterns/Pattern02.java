import java.util.Scanner;
class Pattern02 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

		for (int i=1;i<=num;i++)
		{
			if (i%2!=0)
			{
				for (int j=1;j<=num;j++)
				{
					System.out.print(j);
				}
			}
			else 
			{
				for (int j=num;j>=1;j--)
				{
					System.out.print(j);
				}
			}

			System.out.println();
		}
	}
}
