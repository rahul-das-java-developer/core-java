import java.util.Scanner;
class CheckVowel 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an alphabet(charactor): ");
		char ch=scn.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
			{
				System.out.println(ch+" is a vowel.");
			}
			break;
			default:
			{
				System.out.println(ch+" is a consonant.");
			}
			
		}

	}
}
