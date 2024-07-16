/*Write a program to calculate total salary of an employee for the given details and display the total salary as double and int*/

import java.util.Scanner;
class Salary
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter total number of hours worked :");
		int HoursWorked = s.nextInt();
		System.out.print("Enter the pay rate per hour :");
		float PayPerHour = s.nextFloat();
		float TotalPay = HoursWorked*PayPerHour;
		System.out.println("The total pay(in double) : "+(double)TotalPay);
		System.out.println("The total pay (in int) : " +(int)TotalPay);

	}
}