import java.util.Scanner;
import java.util.Arrays;
class Array2
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
		System.out.println(Arrays.toString(a));		
		System.out.println("---------------------");

		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.println(a[i]);
		}
	}
}