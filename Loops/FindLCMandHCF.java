import java.util.Scanner;
class FindLCMandHCF 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your first number: ");
		int num1=scn.nextInt();

		System.out.println("Enter Your second number: ");
		int num2=scn.nextInt();
		int count=1;

		while (true)
		{
			if (count%num1==0 && count%num2==0)
			{
				System.out.println("The LCM of "+num1+" and "+num2+" is: "+count);
				break;
			}
			count++;
		}
		int hcf=num1<num2?num1:num2;
		while(true)
		{
			if (num1%hcf==0 && num2%hcf==0)
			{
				break;
			}
			hcf--;
		}
		System.out.println("The HCF/GCD of "+num1+" and "+num2+" is: "+hcf);
	}
}
