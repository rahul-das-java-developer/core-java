import java.util.Scanner;
class DecToBin
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a decimal num: ");
		int dec=scn.nextInt();

		System.out.println("The binary value of "+dec+" is: "+decToBin(dec));
	}
	static int decToBin(int dec)
	{
		int bin=0;
		int i=1;
		while (dec>0)
		{
			bin+=(dec%2)*i;
			i*=10;
			dec/=2;
		}
		return bin;
	}
}
