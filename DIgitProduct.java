/*write a program to find digital product of a number*/

import java.util.Scanner;

class DigitProduct
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int prod = 1;
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		while(num != 0)
		{
			int last = num % 10;
			if(last != 0) //to skip 0
				prod *= last;
			num /= 10;
		}
		System.out.println("The digital sum of given number is " + prod);
	}
}