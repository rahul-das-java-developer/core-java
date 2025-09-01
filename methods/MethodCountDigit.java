import java.util.Scanner;
class MethodCountDigit
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();

		System.out.println(count(num));

	}
	static int count(int num)
	{
		int count=0;
		while (num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}
}
