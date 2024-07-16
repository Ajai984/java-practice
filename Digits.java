/*write a program to count number of digits present in a given number*/

import java.util.Scanner;

class Digits
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		while(num != 0)
		{
			count++;
			num = num / 10;
		}
		System.out.println("The number of digits present in the giver number is " + count);
	}

}