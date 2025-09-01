import java.util.Scanner;
class FibonacciUsingLoop 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enetr nth digit to know the fibonacci value: ");
		System.out.println(fib(scn.nextInt()));
	}
	static int fib(int n)
	{
		int f=0;
		int a=0, b=1, c;
		for (int i=1;i<=n;i++)
		{
			f=a;
			c=a+b;
			a=b;
			b=c;
		}
		return f;
		
	}
}
