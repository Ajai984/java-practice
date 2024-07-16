/*Write a program to print digital spy of a number*/

import java.util.Scanner;
class Spy 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		int sum = 0;
		int prod = 1;
		int temp = num;
		while (temp != 0) 
		{
			int last = temp % 10;
			sum += last;
			prod *= last;
			temp /= 10;
		}
		
		System.out.println("The Sum of digits: "+sum);
		System.out.println("The product of digits: "+prod);
		if(sum ==  prod)
			System.out.println(""+ num +" is a Spy Number");
		else
			System.out.println(""+ num + " is not a Spy Number");
	}
}