/*write a program to find digital sum of a number*/

import java.util.Scanner;

class DigitSum
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int sum = 0; //for product change 0 to 1
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		while(num!=0)
		{
			int last = num %10;
			sum+=last;
			num/=10;
		}
		System.out.println("The digital sum of given number is " + sum);
	}

}