import java.util.Scanner;

class BrickMethod
{
	public static void bricks(int big, int small, int goal)
	{
		if(goal%5<=small && (big*5+small) >= goal)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Small Bricks: ");
		int small = s.nextInt();
		System.out.print("Enter big bricks: ");
		int big = s.nextInt();
		System.out.print("Enter the goal: ");
		int goal = s.nextInt();
		bricks(big,small,goal);
	}
}