import java.util.Scanner;
class OddEvenInterview 
{
	public static void main(String[] args) 
	{
		// WAP to check user input number is Even or Odd number without using "/" and "%" operator 

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an Integer number: ");
		int num=scn.nextInt();

		if((num&1)==0)		// the binary representation of num is added with 1, bit by bit using "&" operator  or, (num%2==0)
			{
			System.out.println(num+" is an Even number.");
			}
		else
			{
			System.out.println(num+" is an Odd number.");
			}
	}
}
