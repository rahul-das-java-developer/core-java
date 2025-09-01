import java.util.Scanner;
class SumOfDigUntilSingle 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		int sum=0;

		while(num>0)
		{
			sum+=num%10;			// take the last digit from the number and add
			num/=10;				// delete the last digit from the number
			if(num==0 && sum>9)
			{
				num=sum;
				sum=0;
			}
		}
		System.out.println(sum);
	}
}
