/*write a program to sort the array in ascending order*/

import java.util.Scanner;
import java.util.Arrays;
class ArraySort
{
	public static void AscSort()
	{
		int []a = new int[size];
		

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
		
		System.out.println("Array before Sorting "+Arrays.toString(a));
		AscSort(a);
	}
}