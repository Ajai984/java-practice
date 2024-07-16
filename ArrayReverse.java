
import java.util.Scanner;
import java.util.Arrays;
class ArrayReverse
{
	public static void Reverse(int[] a)
	{
		
		int i = 0;
		int j = a.length-1; //j = a. length;

		while(i < j)
		{
			int temp = a[i];
			a[i] = a[j]; //a[i] = a[n-i-1];
			a[j] = temp; //a[n-i-1] = temp;
			
			i++;
			j--;
		}
		System.out.println("Array after reversing "+Arrays.toString(a));
	}
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
		System.out.println("------------------------");
		
		System.out.println("Array before reversing "+Arrays.toString(a));
		Reverse(a);
	}
}