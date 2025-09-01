import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num for factorial: ");
		System.out.println(factorial(scn.nextInt()));
	}
	static int factorial(int n)
	{
		if (n==0)
		{
			return 1;
		}

		return n*factorial(n-1);
	}
}
