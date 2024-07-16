/*write a program to find reverse of a number */

import java.util.Scanner;
class Reverse
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		int rev = 0;
		while(num>0)
		{
			int last = num % 10;
			rev = ( rev * 10 ) + last;
			num = num / 10;
		}
		System.out.println("The reverse of the number is : "+rev);
	}
}