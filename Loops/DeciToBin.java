import java.util.Scanner;
class DeciToBin 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Decimal number");
		int deci=scn.nextInt();
		int bin=0;
		String str="";

		while(deci>0)
		{
			bin=deci%2;
			deci/=2;
			str=bin+str;
		}
		System.out.println(str);
	}
}
