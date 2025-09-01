class Widening
{
	public static void main(String[] args) 
	{
		byte a=20;		//1 byte
		int b=a;		//4 bytes (widening)
		System.out.println(a+"\t"+b);

		char ch ='A';
		int n=ch;
		System.out.println(ch+"="+n);

		int c=9;
		double d=c;
		System.out.println(c+"\t"+d);
	}
}
