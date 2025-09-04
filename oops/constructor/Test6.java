class Box
{
	int height;
	int width;
	int length;

	Box(){
	}

	Box(int h,int w,int l){
		height=h;
		width=w;
		length=l;
	}
	Box(int n){
		height=n;
		width=n;
		length=n;
	}

	void display(){
		System.out.println("Box: ["+height+","+width+","+length+"]");
	}
}
class Test6
{
	public static void main(String[] args) 
	{
		Box b1=new Box();
		Box b2=new Box(5);
		Box b3=new Box(10,20,35);

		b1.display();
		b2.display();
		b3.display();

	}
}
