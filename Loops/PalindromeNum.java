import java.util.Scanner;
class PalindromeNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		int temp=num;
		int reverse=0;
		
		while (num>0)
		{
			int digit=num%10;
			reverse=(reverse*10)+digit;
			num/=10;
		}
		num=temp;
		if (num==reverse)
		{
			System.out.println(num+" is a Palindrome Number.");
		}
		else
		{
			System.out.println(num+" is not a Palindrome Number.");
		}
	}
}
