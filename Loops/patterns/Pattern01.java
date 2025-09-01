import java.util.Scanner;
class Pattern01 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

     
			for (int i=1;i<=num;i++)
		{
			for (int j=num;j>=i;j--)
			{
				System.out.print(j);
				if (j>i)					// if (j==i)	break;
				{
					System.out.print("*");	
				}
			}
			System.out.println();
		}
	}
}
