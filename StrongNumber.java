/*Write a program to check whether the given number is a strong number*/

import java.util.Scanner;

class StrongNumber
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int sum = 0; 
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		while(num!=0)
		{
			int last = num % 10;
			int fact = 1;
			for (int i = 1; i<=last ;i++) 
			{
				fact*=i;	
			}
			sum+=fact;
			num/=10;
		}
		if(sum == temp)
			System.out.println("Strong number");
		else
			System.out.println("Not a Strong number");
	}

}