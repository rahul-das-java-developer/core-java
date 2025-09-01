class ForEachLoop 
{
	public static void main(String[] args) 
	{
		int [] a={10,20,30,45};
		System.out.println("Array Length: "+a.length);
		System.out.println("Array index: "+a[0]);
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Array index: "+a[i]);
		}
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.println("Array index: "+a[i]);
		}


		// With out using this we can use for-each loop, it always iterates first index to last

		for (int e:a)	// if array 'a' conatains integer value then use int its depens upon the value stored in array
		{
			System.out.print(e+" ");
		}



	}
}
