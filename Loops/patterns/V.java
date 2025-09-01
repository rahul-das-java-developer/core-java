import java.util.Scanner;
class V
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a odd num: ");
		int num= scn.nextInt();

		for (int i=1;i<=(num/2)+1;i++)
		{
			for (int j=1;j<=num;j++)
			{
				if (i==j || i+j==num+1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}		
			}
			System.out.println();
		}
	}
}
