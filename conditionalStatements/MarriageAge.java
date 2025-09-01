import java.util.Scanner;
class MarriageAge 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scn.nextInt();

		if(age>=27)
		{
			if(age<=32)
			{
				System.out.println("Your age is perfect for marriage.");
			}
			else
			{
				System.out.println("You are over age.");
			}
		}
		else
		{
			System.out.println("You are still minor(Under age).");
		}

	}
}
