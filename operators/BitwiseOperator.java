class BitwiseOperator 
{
	public static void main(String[] args) 
	{
		//	Bitwise operators compared the binary representation bit by bit

		int num1=2147483647;	//	2^31
		int num2=1;
		long res=num1+num2;		/*	before assigning the value of (a+b) its overflow,
									thats why the sum of these numbers didn't reach to the long type.
									First java do the operation of (a+b) then the result assigned and stored in c
								*/
		System.out.println(res);


		int a=21;
		int b=-37;

		int c=a&b;		// bitwise AND operator, 
		System.out.println(c);
		
		int d=a|b;		// bitwise OR operator,
		System.out.println(d);
		
		int e=a^b;		// bitwise XOR operation,
		System.out.println(e);

		int f=~a;		// bitwise NOT operator,
		System.out.println(f);

	}
}
