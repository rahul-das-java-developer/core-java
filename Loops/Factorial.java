import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number for factorial: ");	
		int n=scn.nextInt();

		int fact=1;
		for(int i=1;i<=n;i++){
		fact*=i;
		}
		System.out.println("The factorial of "+n+" is :"+fact);		// production of all "i" iteration
	}
}
