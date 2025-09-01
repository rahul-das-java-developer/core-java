import java.util.Scanner;
class  SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scn.nextInt();

		int sum=0;
		while(num>0)
		{
			sum+=num%10;			//	take the last digit from the whole number
			num/=10;				//	deleted the last digit
		}
		System.out.println(sum);
	}
}
