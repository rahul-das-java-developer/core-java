import java.util.Scanner;
class NumOfCurrencies 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter amount(multiple of 100): ");
		int amt=scn.nextInt();

		if(amt>=2000)
		{
			System.out.println("2000 x "+(amt/2000));
			amt=amt%2000;
		}
		
		if(amt>=500)
		{
			System.out.println("500 x "+(amt/500));
			amt=amt%500;
		}

		if(amt>=200)
		{
			System.out.println("200 x "+(amt/200));
			amt=amt%200;
		}
		
		if(amt>=100)
		{
			System.out.println("100 x "+(amt/100));
		//	amt=amt%100;
		}


	}
}
