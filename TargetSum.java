/*write a program to find pair whose sum is equal to target value*/

import java.util.Arrays;
class TargetSum
{
	public static void findPair(int[] a, int target)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("["+a[i]+" , "+a[j]+"]");
				}
			}
		}
		/*Arrays.sort(a);
		int i = 0;
		int j = a.length - 1;

		while(i<j)
		{
			int sum = a[i]+a[j];
			if(sum == target)
			{
				System.out.println("Pair found");
				System.out.println(a[i]+" + "+a[j]+" = " +target);
				return;
			}
			else if(sum<target)
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		System.out.println("Pair not found.");*/
	}
	public static void main(String[] args) 
	{
		int []a = {2,4,6,3,8,1};
		int target = 5;
		findPair(a,target);
	}
}