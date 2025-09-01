import java.util.Scanner;
class S
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
				if (i==1 || i==(num/2)+1 || i==num )	// incomplete..........
				{
					System.out.print("*");
				}
				else if (i<(num/2)+1)
				{
					if (j==1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if (i>(num/2)+1)
				{
					if (j==num)
					{
						System.out.print("*");
					}
				}
			
						
			}
			System.out.println();
		}
	}
}
