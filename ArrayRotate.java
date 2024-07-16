/*write a program to left rotate an array*/
import java.util.Scanner;
import java.util.Arrays;
class ArrayRotate 
{
	public static void ArrayLeftRotate(int[] a)
	{
		int temp = a[0];
		for(int i = 1; i<a.length; i++)
		{
			//a[i-1] = a[i];
			a[i] = a[i-1] - a[i] + (a[i-1] = a[i]);
		}
		// a[a.length - 1] = temp;*/
		System.out.println("After left rotate "+Arrays.toString(a));
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
			System.out.println("Before left rotate "+Arrays.toString(a));
		ArrayLeftRotate(a);
	}
}