/*write a program to print week name for the given value of the week*/
import java.util.Scanner;
class week
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the week number: ");
		int a = sc.nextInt();
		switch (a) 
		{
			case 1:
				{
					System.out.println("Monday");
					break;
				}
			case 2:
				{
					System.out.println("Tuesday");
					break;
				}
			case 3:
				{
					System.out.println("Wednesday");
					break;
				}
			case 4:
				{

					System.out.println("Thursday");
					break;
				}
			case 5:
				{
					System.out.println("Friday");
					break;
				}
			case 6:
				{
					System.out.println("Saturday");
					break;
				}
			case 7:
				{
					System.out.println("Sunday");
					break;
				}
			default:
				{
					System.out.println("The entered number is above 7. Please enter a valid number.");
				}
		}
	}	
}