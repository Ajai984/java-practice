/*write a program to check whether first and last element of an array is equal*/

import java.util.Scanner;
class Array1
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

		if(a[0]==a[a.length-1])
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}