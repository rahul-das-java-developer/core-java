import java.util.Scanner;
class FibonacciDigit 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enetr nth digit to know the fibonacci value: ");
		System.out.println(fib(scn.nextInt()));
	}
	static int fib(int n)
	{
		if (n==1)
		{
			return 0;
		}
		if (n==2)
		{
			return 1;
		}
		return fib(n-1)+fib(n-2);
		
	}
}


	/*

		** Sloved by a student **

		static int fib(int n, int a, int b)
		{
			if (n==1) return a;
			return fib(n-1,b,a+b);
		}

		p.s.v.main(){
			sop(fib(25));
		}


	*/