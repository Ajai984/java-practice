import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = s.nextInt();

		int [] a = new int[size];

		System.out.println("Enter the values : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("---------------------");

		System.out.print("[");
		for(int i = 0; i < a.length; i++)
		{
			if(i==a.length-1)
			System.out.print(a[i]+"]");
			else
				System.out.print(a[i]+",");
		}
	}
}