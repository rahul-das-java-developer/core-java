class ShiftingOperator 
{
	public static void main(String[] args) 
	{
		int a=21;
		int b=a>>2;		// signed right shift, it shifted the binary bit right side 2 times and adds current sign bit to the left side i.e. 0
		System.out.println(b);

		int c=a>>>2;	// unsigned right shift, it shifted the binary bit right side 2 times and adds always zero(0) to the left side
		System.out.println(c);
		
		int d=a<<2;		// left shift, it shifted the binary bit left side 2 times and adds always zero(0) to the right side
		System.out.println(d);


		int e=a>>34;	// it only shifting 2 times	[34%32 is 2], 
		System.out.println(e);
	}
}
