import java.util.Scanner;
class SumOfNaturalNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number for sum: ");	
		int n=scn.nextInt();

		int sum=0;
		for(int i=1;i<=n;i++){
		sum+=i;
		}
		System.out.println("Sum of all Natural numbers is: "+sum);		// Sum of all "i" iteration
	}
}
