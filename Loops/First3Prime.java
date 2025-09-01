import java.util.Scanner;
class First3Prime 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st=scn.nextInt();
		System.out.println("Enter ending range: ");
		int end=scn.nextInt();
		
		int count=0;
		for (int i=st;i<=end;i++)
		{
			boolean flag=true;
			for (int j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
		 	if (i>1 && flag)
			{
				count++;
				if (count<=3)
				{
					System.out.println(i);
				}
				
			}
		}

	}
}
