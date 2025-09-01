import java.util.Scanner;
class Pattern16 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an Odd number: ");
		int	num=scn.nextInt();
		
		int  n=num-1;
		
		for (int i=1;i<=num;i++)
		{
			char ch='E';
			for (int j=1;j<=num;j++)
			{
				if (j>n)
				{
					// char ch=(char)(num+64);
					System.out.print(ch);
					ch--;
				}
				else
				{
					System.out.print(j);
				}
			}

			System.out.println();
			n--;

			

		}
	}
}
