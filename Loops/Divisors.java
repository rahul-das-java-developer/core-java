import java.util.Scanner;
class Divisors 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
		
		// loops checks with 1 then 2 then 3 then 4,5,6..... is divided or not

		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(num!=i)
				{
					System.out.print(i+",");
				}
				else
				{
					System.out.println(i);
				}
					
			}
		}
	}
}
