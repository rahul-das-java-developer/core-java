import java.util.Scanner;
class DeciToBinInt 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Decimal number");
		int deci=scn.nextInt();
		int bin=0;
		int i=1;

		while(deci>0)
		{
			int bit=deci%2;
			bin=(bit*i)+bin;
			deci/=2;
			i*=10;			
		}
		System.out.println(bin);
	}
}
