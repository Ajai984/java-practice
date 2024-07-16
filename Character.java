import java.util.Scanner;
class Character
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		char a = sc.next().charAt(0);
		System.out.println("The Character is: "+a);
	}
}