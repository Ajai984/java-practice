import java.util.Scanner;
class Concatinate
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String a = sc.next();
		System.out.print("Enter your friend's name : ");
		String b = sc.next();
		System.out.println("The Character is: "+(a+b));
	}
}