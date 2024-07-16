/*Write a program to check whether the given number is a perfect number.*/

import java.util.Scanner;	
class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n = s.nextLong();
		long sum = 0l;
		for (int i = 1; i <= n/2 ; i++ ) 
		{
			if (n%i==0) 
			{
				sum+=i;
					}
				}
		if(sum == n)
			System.out.println(n+ " is a perfect number.");
		else
			System.out.println(n+ " is not a perfect number.");
	}
}