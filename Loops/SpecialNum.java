import java.util.Scanner;
class SpecialNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		int temp=num;
		int sum=0;
		while (num>0)
		{
			sum+=num%10;
			num/=10;
		}
	//	System.out.println(sum);

		int prod=1;
		num=temp;
		while (num>0)
		{
			prod*=num%10;
			num/=10;
		}
	//	System.out.println(prod);

		num=temp;
		int result=sum+prod;
		if (result==num)
		{
			System.out.println(num+" is a Special Number.");
		}
		else
		{
			System.out.println(num+" is not a Special Number.");
		}
	}
}
