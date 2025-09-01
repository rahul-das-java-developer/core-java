import java.util.Scanner;
class Pattern09
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n=scn.nextInt();
		
		int num=1;
		for (int i=1;i<=n;i++)
		{
			if (i%2!=0)
			{
				for (int j=1;j<=n;j++)
				{
					System.out.print(num+"  ");
					num++;
				}
				num+=n-1;
			}
			else 
			{
				/*for (int j=1;j<n;j++)
				{
					num++;
				}*/
				for (int k=num;k>num-n;k-- )
				{
					System.out.print(k+"  ");
				}
				num++;
			}

			System.out.println();
			}
	}
}
