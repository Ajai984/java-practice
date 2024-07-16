/*write a program to remove dulipcates from an array*/
import java.util.Arrays;
class DuplicateArr 
{
	public static void dupArr(int[] a)
	{
		int c = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i]!=1 && a[j]!=1 && a[i]==a[j])
				{
					a[j] = -1;
					c++;
				}
			}
		}
		int []b = new int[a.length-c];
		int index = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				b[index++] = a[i];
			}
		}
		System.out.println("After removing duplicate values : "+Arrays.toString(b));
	}
	public static void main(String[] args) 
	{
		int []a ={1,2,4,3,2,6,7,4,6};
		System.out.println("Original Array : "+Arrays.toString(a));
		dupArr(a);
	}
}