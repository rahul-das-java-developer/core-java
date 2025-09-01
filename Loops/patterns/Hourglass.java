import java.util.Scanner;
class Hourglass 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an odd num: ");
		int num=scn.nextInt();
		
		int space=0;
		int star=num;

		for (int i=1;i<=num;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++)
			{
				System.out.print("*");
			}

			System.out.println();

			if (i<=num/2)
			{
				space++;
				star-=2;
			}
			else
			{
				space--;
				star+=2;
			}

		}
	}
}
