import java.util.Scanner;
class Pattern09Sir
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n=scn.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			if (i%2!=0)
			{
				int num=((i-1)*n)+1;
				for (int j=1;j<=n;j++)
				{
					System.out.print(num+"  ");
					num++;
				}
			}
			else 
			{
				int num=i*n;;
				for (int j=1;j<=n;j++)
				{
					System.out.print(num+"  ");
					num--;
				}
			}
			System.out.println();
		}
	}
}
