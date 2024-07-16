/*write a program to find sum of all element in array*/

import java.util.Scanner;
import java.util.Arrays;
class Array3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = s.nextInt();

		int [] a = new int[size];
		int b = 0;

		System.out.println("Enter the values : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length ; i++ ) 
		{
			b+=a[i];
		}
		System.out.println("The sum of all elements in array is "+b);
	}
}