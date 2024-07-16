import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of operand1: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of operand2: ");
		int b = sc.nextInt();
		System.out.println("------------------------");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("------------------------");
		System.out.print("Please enter your choice of operator: ");
		int op = sc.nextInt();
		switch(op)
		{
			case 1:
				{
					int res = a + b;
					System.out.println("The Addition of A and B : " + res);
					break;
				}
			case 2:
				{
					int res = a - b;
					System.out.println("The Subtraction of A and B : " + res);
					break;
				}
			case 3:
				{
					int res = a * b;
					System.out.println("The Product of A and B : " + res);
					break;
				}
			case 4:
				{
					int res = a / b;
					System.out.println("The Division of A and B : " + res);
					break;
				}
			default:
				{
					System.out.println("Please provide a valid operator.");
				}
		}
	}
}