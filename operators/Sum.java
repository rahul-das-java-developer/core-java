import java.util.Scanner;
class Sum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=scn.nextInt();
		System.out.print("Enter the second number: ");
		int num2=scn.nextInt();
		System.out.print("The sum of "+num1+" and "+num2+" is: "+(num1+num2));

	}
}
