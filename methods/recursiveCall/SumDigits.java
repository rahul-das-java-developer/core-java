import java.util.Scanner;
class SumDigits 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enetr a number: ");
		System.out.println(sumDigit(scn.nextInt()));
	}
	static int sumDigit(int n)
	{
		if(n==0)						//	if (n<=9)
		{
			return 0;					//	return n;
		}
		return sumDigit(n/10)+(n%10);
	}
}
