import java.util.Scanner;
class OctToDeci 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");		//0110
		int oct=scn.nextInt();
		int deci=0;
		int i=1;
		
		while (oct>0)
		{
			deci+=(oct%10)*i;
			oct/=10;
			i*=8;
		}
		System.out.println(deci);

	}
}
