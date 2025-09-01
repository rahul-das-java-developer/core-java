import java.util.Scanner;
class SquarePattern
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

     
		for (int i=1;i<=num;i++)
		{
			if (i==1 || i==num)
			{
				for (int j=1;j<=num;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				System.out.print("*");
				for (int j=2;j<num;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
