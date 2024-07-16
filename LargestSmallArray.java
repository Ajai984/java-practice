/*Write a program to find the largest and smallest element in an array */
import java.util.*;
class LargestSmallArray
{
	public static void Largest(int size,int []a)
	{
		int max = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
				max = a[i];
		}
		System.out.println("The Largest element in the array : "+max);
	}
	
	public static void Smallest(int size,int []a)
	{
		int min = a[0];
		for (int i = 0; i < a.length ; i++) 
		{
			if(min>a[i])
				min = a[i];
		}
		System.out.println("The smallest element in the array : "+min);
	}

	public static void Array()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = s.nextInt();
		int [] a = new int[size];
		
		System.out.println("Enter the values : ");

		for(int i = 0; i < size; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(a));
		Largest(size,a);
		Smallest(size,a);

	}
	public static void main(String [] args)
	{
		Array();
	}
}