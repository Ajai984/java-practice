class Pattern4
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter no of rows: " );
		int rows = sc.nextInt();
		for (int i=rows ; i>=1 ; i-- ) 
		{
			for (int j=1 ; j<=i ; j++ ) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}