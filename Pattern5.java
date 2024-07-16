import java.util.Scanner;
class Pattern5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the multiplicant : ");
		int n = sc.nextInt();
		System.out.print("Enter the multiplier : ");
		int m = sc.nextInt();
		for ( int i = 1; i<=n; i++)
		{
			for( int j = 1; j<=m; j++)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println("------------------------------");	
		}
	}
}