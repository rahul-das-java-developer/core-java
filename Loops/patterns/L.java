import java.util.Scanner;
class L
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a odd num: ");
		int num= scn.nextInt();

		for (int i=1;i<=num;i++)
		{
			for (int j=1;j<=num;j++)
			{
				if (j==1 || i==num)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
