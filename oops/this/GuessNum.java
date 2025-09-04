import java.util.*;
class GuessNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=scn.nextLine();

		int bot=(int)(Math.random()*9)+1;
		int score=0;

		for (int i=3;i>=1;i--)
		{
			System.out.println("You have "+i+" chances:");
			System.out.println("Guess a number between 1 to 9: ");
			int you=scn.nextInt();
		//	System.out.println("The Right number is: "+bot);
			if (bot==you)
			{
				score+=10;
				System.out.println("Congratulation! you guess a right number.");
				System.out.println("Your current score is:"+score);
				bot=(int)(Math.random()*9)+1;
			}
		/*	else
			{
				System.out.println("Wrong answer, you guess a wrong number.");
				System.out.println("Your current score is:"+score);
				bot=(int)(Math.random()*9)+1;
			}*/
		}
		System.out.println(name+", you scored: "+score);
	}
}
