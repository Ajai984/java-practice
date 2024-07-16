import java.util.Scanner;
class Methods
{
	public static void Add(int a, int b)
	{
		int sum = a + b;
		System.out.println("The Addition of "+a+" and"+" "+b+" is :"+sum);
	}
	public static void Sub(int a,int b)
	{
		int diff = a - b;
		System.out.println("The Subtraction of "+a+" and"+" "+b+" is :"+diff);
	}
	public static void Product(int a, int b)
	{
		int prod = a * b;
		System.out.println("The Product of "+a+" and"+" "+b+" is :"+prod);
	}
	public static void Division(int a,int b)
	{
		int div = a / b;
		System.out.println("The Division of "+a+" and"+" "+b+" is :"+div);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = s.nextInt();
		System.out.print("Enter the value of b: ");
		int b = s.nextInt();
		System.out.println("*****************************************");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("*****************************************");
		System.out.print("Enter your choice: ");
		int ch = s.nextInt();
		switch(ch)
		{
			case 1:
				Add(a,b);
				break;
			case 2:
				Sub(a,b);
				break;
			case 3:
				Product(a,b);
				break;
			case 4:
				Division(a,b);
				break;
			default:
				System.out.println("Invalid Choice!Please enter a valid choice.");
		}
	}
}