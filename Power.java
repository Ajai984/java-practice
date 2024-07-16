/*Write a program to find x to the power n.*/

import java.util.Scanner;
class Power
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the base value : ");
		int base = s.nextInt();
		System.out.print("Enter the power value: ");
		int power = s.nextInt();
		int res = 1;
		for (int i = 0; i < power ; i++ ) 
		{
			res*=base;
		}
		System.out.println(res);
	}
}