
import java.util.Scanner;
class ScannerMethods
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Something(word/token): ");
		String s1=scn.next();				// it take only one word/token from the cmd
		System.out.println("You entered: "+s1);

		System.out.println("Enter an Integer value: ");
		int num1=scn.nextInt();				// it take only integer number	
		System.out.println("You entered: "+num1);

		System.out.println("Enter an Byte value: ");
		byte b1=scn.nextByte();				// it take only byte number	
		System.out.println("You entered: "+b1);

		System.out.println("Enter an Short value: ");
		short num2=scn.nextShort();			// it take only Short number	
		System.out.println("You entered: "+num2);

		System.out.println("Enter an long value: ");
		long num3=scn.nextLong();			// it take only long number	
		System.out.println("You entered: "+num3);

		System.out.println("Enter an Float value: ");
		float num4=scn.nextFloat();			// it take only Float number	
		System.out.println("You entered: "+num4);

		System.out.println("Enter an Double value: ");
		double num5=scn.nextDouble();		// it take only double number	
		System.out.println("You entered: "+num5);

		System.out.println("Enter an String/Line: ");
		String s2=scn.nextLine();			// it take only string means it takes the whole line from the cmd 	
		System.out.println("You entered: "+s2);

		System.out.println("Enter an Boolean value: ");
		boolean bln=scn.nextBoolean();		// it take only boolean statement	
		System.out.println("You entered :"+bln);

	}
}
