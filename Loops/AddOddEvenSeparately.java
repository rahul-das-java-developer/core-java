import java.util.Scanner;
class AddOddEvenSeparately 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scn.nextInt();

		int sumEven=0;
		int sumOdd=0;

		while(num>0)
		{
			int digit = num%10;
			if(digit%2==0)
			{
				sumEven+=digit;
			}
			else
			{
				sumOdd+=digit;
			}
			num/=10;				
		}
		System.out.println("Sum of all Odd digits is "+sumOdd);
		System.out.println("Sum of all Even digits is "+sumEven);
	}
}
