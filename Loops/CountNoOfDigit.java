import java.util.Scanner;
class CountNoOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();

		int count=0;
		while(num>0)
		{
			// int digit=num%10;
			num/=10;
			count++;
		}
		System.out.println("The number "+num+" includes "+count+" digits");
	}
}
