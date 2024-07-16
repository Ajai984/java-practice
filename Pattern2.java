class Pattern2 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter no of rows: " );
		int rows = sc.nextInt();
		System.out.print("Enter no of coloums: " );
		int col = sc.nextInt();
		for (int i=rows ; i>=1 ; i-- ) 
		{
			for (int j=col ; j>=i ; j-- ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}