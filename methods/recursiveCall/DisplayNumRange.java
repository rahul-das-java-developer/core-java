import java.util.Scanner;
class DisplayNumRange
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int st=scn.nextInt();
		System.out.println("Enter ending range: ");
		int end=scn.nextInt();


		display(st,end);
	}

	static void display(int st,int end)
	{
		if (st>end)
		{
			return ;
		}
		System.out.println(st);
		display(st+1,end);
	}
}
