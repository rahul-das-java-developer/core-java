class InterviewQues
{
	public static void main(String[] args) 
	{
		int a=5;

		if(a%2==0)		// If there is no curly bracket then java only execute first statement by considering it is if block
		++a;			// java will not execute this statement bcoz if block is false but it will execute rest of the statements 
		++a;
		++a;
		System.out.println(a);
	}
}
