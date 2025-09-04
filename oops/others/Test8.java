class AC
{
	int temp=21;

	void increaseTemp()
	{
		temp++;
		System.out.println("Tempature increased, current tempature is "+temp);
	}
	void decreaseTemp()
	{
		temp--;
		System.out.println("Tempature decreased, current tempature is "+temp);
	}
}
class Test8 
{
	public static void main(String[] args) 
	{
		AC ac1=new AC();
		ac1.increaseTemp();
		ac1.increaseTemp();
		ac1.increaseTemp();
		ac1.decreaseTemp();
	}
}
