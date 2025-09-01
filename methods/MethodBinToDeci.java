import java.util.Scanner;
class MethodBinToDeci
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Binary value: ");
		int bin=scn.nextInt();

		System.out.println(binToDeci(bin));

	}
	static int binToDeci(int bin)
	{
		int deci = 0;
		int i=1;
		while (bin!=0)
		{
			deci+=(bin%10)*i;
			i*=2;
			bin/=10;
		}
		return deci;
	}
}
