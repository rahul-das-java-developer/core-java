
import java.util.Scanner;
class BaseNPower 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base=scn.nextInt();
		System.out.println("Enter the power: ");
		int power=scn.nextInt();
		
		long result=1;
		for(int i=1; i<=power; i++)
		{
			result*=base;
		}
		System.out.println("The result of "+base+" to the power "+power+" is: "+result);
	}
}