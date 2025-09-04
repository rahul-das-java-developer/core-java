class AA 
{
	AA(){
		System.out.println("AA() constructor");
	}
		
	AA(int i)
	{
		this();
		System.out.println("AA(int i) constructor: "+i);
	}

	public static void main(String[] args) 
	{
		new AA(69);
	}
}
