import java.util.Scanner;
class Largest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of B: ");
		int b = sc.nextInt();
		System.out.print("Enter the value of C: ");
		int c = sc.nextInt();
		if (a>b) 
		{
			if(a>c)
			{
				System.out.println(a+ " is the largest");
			}
			else
			{
				System.out.println(c+ " is the largest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is the largest");
			}
			else
			{
				System.out.println(c+" is the largest");
			}
		}
	}
}