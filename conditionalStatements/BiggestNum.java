import java.util.Scanner;
class BiggestNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=scn.nextInt();
		int num2=scn.nextInt();

		if(num1>num2)
		{
			System.out.println(num1+" is the Biggest number.");
		}
		else if(num2>num1)
		{
			System.out.println(num2+" is the Biggest number.");
		}
		else
		{
			System.out.println("Both number are equal.");
		}

	}
}
