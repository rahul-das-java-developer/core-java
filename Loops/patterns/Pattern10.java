import java.util.Scanner;
class Pattern10
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

		char c='A';     
		for (int i=1;i<=num;i++)
		{
			for (int j=1;j<=num;j++)
			{
				if(i==j)
					System.out.print(c++ +" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
