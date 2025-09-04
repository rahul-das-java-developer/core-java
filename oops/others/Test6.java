class Books
{	
	String title;

	void display()
	{
		System.out.println("Title ="+title);
	}
}
	
class Test6
{
	public static void main(String[] args) 
	{
		Books b1=new Books();
		b1.title="JAVA";
		b1.display();
		b1=null;
		b1.display();

	}
}
