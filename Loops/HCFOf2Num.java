import java.util.Scanner;
class HCFOf2Num
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num1=scn.nextInt();

		System.out.println("Enter another num: ");
		int num2=scn.nextInt();

		int hcf=num1<num2?num1:num2;
		while(true)
		{
			if (num1%hcf==0 && num2%hcf==0)
			{
				break;
			}
			hcf--;
		}
		System.out.println("The HCF/GCD of "+num1+" and "+num2+" is "+hcf);
	}
}
