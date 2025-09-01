import java.util.Scanner;
class FibonacciSeries02
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int num=scn.nextInt();
		int a=0,b=1,c;
		
		while(a<=num)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
