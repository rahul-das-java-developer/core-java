import java.util.Scanner;
class Pattern06
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

		int spaces=num-1;
		for (int i=1;i<=num;i++)
		{
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}

			System.out.println();
			spaces--;
		}
	}
}
