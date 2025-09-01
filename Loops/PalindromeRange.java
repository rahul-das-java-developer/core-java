import java.util.Scanner;
class PalindromeRange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st=scn.nextInt();
		System.out.println("Enter ending range: ");
		int end=scn.nextInt();
		

		for (int i=st;i<=end;i++)
		{
			int temp=i;
			int pal=0;
			while (i>0)
			{
				pal=(pal*10)+(i%10);
				i/=10;
			}
			i=temp;
			if (pal==i)
			{
				System.out.println(i);
			}
		}
	}
}
