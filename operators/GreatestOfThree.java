class GreatestOfThree 
{
	public static void main(String[] args) 
	{
		int num1=19;
		int num2=96;
		int num3=41;

		int res= num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);

		System.out.println("The greatest number among the three number is "+res);
	}
}
