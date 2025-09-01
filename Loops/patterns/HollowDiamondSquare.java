import java.util.Scanner;
class HollowDiamondSquare 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a odd num for better output: ");
		int num=scn.nextInt();

		int spaces=1;
		int stars=num/2;

		for (int i=1;i<=num;i++)
		{
			if (i==1||i==num)
			{
				for (int j=1;j<=num;j++)
				{
					System.out.print("*");
				}
				System.out.println();
				continue;
			}
			
			for (int j=1;j<=stars;j++)
			{
				System.out.print("*");			
			}
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");			
			}
			for (int j=1;j<=stars;j++)
			{
				System.out.print("*");			
			}

			System.out.println();

			if (i<=num/2)
			{
				stars--;
				spaces+=2;
			}
			else
			{
				stars++;
				spaces-=2;
			}
		}
	}
}
