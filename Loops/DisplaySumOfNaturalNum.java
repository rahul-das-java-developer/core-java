import java.util.Scanner;
class DisplaySumOfNaturalNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");	
		int n=scn.nextInt();

		int sum=0;
		String str="";				// empty string

		for(int i=1;i<=n;i++)
		{
		sum+=i;
		str=str+i;					// stored all iterated value one by one as a string
			if (i<n)
			{
				str=str+"+";		// for adding "+" symbol after each and every digit
			}
		}
		System.out.println("Sum of all Natural numbers: "+str+" = "+sum);		// Sum of all "i" iteration with their displayed value
	}
}
