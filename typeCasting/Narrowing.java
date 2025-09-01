class Narrowing 
{
	public static void main(String[] args) 
	{
		double d=5.9;
		int n=(int)d;
		System.out.println(d+"\t"+n);

		int num=70;
		char ch=(char)num;
		System.out.println(num+" = "+ch);

		int i=130;
		byte b=(byte)i;
		System.out.println(i+"\t"+b);
	}
}
