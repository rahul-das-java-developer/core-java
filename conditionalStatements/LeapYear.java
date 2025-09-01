import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Year: ");
		int year=scn.nextInt();

		if(year%400==0 || (year%4==0 && year%100!=0))
		{
			System.out.println(year+" is a leap year.");
		}
		else
		{
			System.out.println(year+" is not a leap year.");
		}
	}
}
