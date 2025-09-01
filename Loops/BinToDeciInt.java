import java.util.Scanner;
class BinToDeciInt 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int bin=scn.nextInt();
		int deci=0;
		int i=1;

		while(bin>0)
		{
			deci+=(bin%10)*i;
			bin/=10;
			i*=2;			
		}
		System.out.println(deci);
	}
}
