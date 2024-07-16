import java.util.Scanner;
class NumberChecker
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if (num >= 0) 
		{
			if(num != 0)
			{
				System.out.println(num+" is a positive number");
			}
			else
			{
				System.out.println(num+ " is zero");
			}
		}
		else
		{
			System.out.println(num+ " is a negative number");
		}
	}
}