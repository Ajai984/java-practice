/*write a program to check whether the number is palindrome*/

import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		int rev = 0;
		int temp = num;
		while(num>0)
		{
			int last = num % 10;
			rev = ( rev * 10 ) + last;
			num = num / 10;
		}
		if(temp == rev)
			System.out.println("The given number is a palindrome");
		else
			System.out.println("The given number is not a palindrome");
	}
}