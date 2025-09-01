import java.util.Scanner;
class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}
