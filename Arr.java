import java.util.Scanner;
import java.util.Arrays;
class Arr
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
		System.out.println(Arrays.toString(a));
		copyArray(a);
	}

	public static void copyArray(int[] a)
	{
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));

	}
}
