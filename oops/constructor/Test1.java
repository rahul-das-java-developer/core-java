class Car
{
	int regNum;
	private static int n=1000;

	Car()
	{
		regNum=n++;
	}

}
class Test1
{
	public static void main(String[] args) 
	{
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();

		System.out.println(c1.regNum);
		System.out.println(c2.regNum);
		System.out.println(c3.regNum);
	}
}
