import java.util.Scanner;
class Pattern14
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=scn.nextInt();
		int stars=(num*2)-1;
		int spaces=0;

		for (int i=1;i<=num;i++)
		{
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			stars-=2;
			spaces++;
		}
	}
}
