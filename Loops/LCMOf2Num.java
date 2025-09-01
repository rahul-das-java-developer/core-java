import java.util.Scanner;
class LCMOf2Num 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your first number: ");
		int num1=scn.nextInt();

		System.out.println("Enter Your second number: ");
		int num2=scn.nextInt();

		int i,j,mul1=0,mul2=0;
		for(i=1;i<=num2;i++)		// for num1
		{
			mul1=num1*i;
		//	System.out.println("Multiples of "+num1+" is: "+mul1);

			for (j=1;j<=num1;j++ )	// for num2
			{
				mul2=num2*j;
			//	System.out.println("Multiples of "+num2+" is "+mul2);

				if (mul1==mul2)
				{
					//System.out.println("LCM of "+num1+" and "+num2+" is: "+mul1);
					break;
				}

			}
			if (mul1==mul2)
				{
					System.out.println("LCM of "+num1+" and "+num2+" is: "+mul1);
					break;
				}
		}





	}
}
