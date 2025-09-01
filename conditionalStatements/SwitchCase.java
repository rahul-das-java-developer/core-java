class SwitchCase 
{
	public static void main(String[] args) 
	{
		int opt=2;
		switch(opt)
		{
			case 1:
			{
				System.out.println("Case 1 is executed");
			}
			break;			// break part is mandatory.
			case 2:
			{
				System.out.println("Case 2 is executed");
			}
			break;			// break part is mandatory.
			case 3:
			{
				System.out.println("Case 3 is executed");
			}
			break;			// break part is mandatory.

			default:		// default block does not mandatory.
			{
				System.out.println("Default bolck is executed");
			}

		}
	}
}
