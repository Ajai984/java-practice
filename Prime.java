/*Write a program to check whether the given number is a prime number.*/

import java.util.Scanner;
class Prime
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		boolean flag = true;
		for(int i = 2; i <= num / 2; i++ )
		{
			if(num % i == 0)
				flag = false;
		}
		if(flag)
			System.out.println(num+" is a prime number.");
		else
			System.out.println(num+" is not a prime number.");
	}
}
