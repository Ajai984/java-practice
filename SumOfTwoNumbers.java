import java.util.Scanner;
class SumOfTwoNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of B: ");
		int b = sc.nextInt();
		System.out.println("Sum of A and B :"+(a+b));
	}
}