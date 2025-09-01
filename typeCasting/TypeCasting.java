class TypeCasting 
{
	public static void main(String[] args) 
	{
		long a=230;		// 8 bytes
		float b=a;		// 4 bytes	(Widening)
		System.out.println(a+"\t"+b);

		float c=5.6f;		// 4 bytes
		long d=(long)c;		// 8 bytes (Narrowing)
		System.out.println(c+"\t"+d);

		int num=(int)Math.pow(5,3);		// Narrowing
		System.out.println(num);

		System.out.println(Math.pow(3,3));	// Math.pow is a method which returns double type value


	}
}
