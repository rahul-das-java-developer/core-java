import java.util.Scanner;
class Pattern13 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=scn.nextInt();
		int star=1;

		for (int i=1;i<=num;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			if(i<=num/2)
				star++;
			else
				star--;

			System.out.println();
		}
	}
}
