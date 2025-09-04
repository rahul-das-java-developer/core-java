class C
{
	int i;
	int j;

	C(){
		i=10;
	}
	C(int args){
		j= args;
	}
}
class Test4 
{
	public static void main(String[] args) 
	{
		C c1=new C();
		C c2=new C(50);
		
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c2.i);
		System.out.println(c2.j);

	}
}
