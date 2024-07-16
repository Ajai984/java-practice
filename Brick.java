import java.util.Scanner;
class Brick
{
	public static void main(String[] args) 
	{
		int BigBrickUnit = 5;
		int SmallBrickUnit = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your goal state number : ");
		int goal = s.nextInt();
		System.out.print("Enter the number of big brick you want to use : ");
		int big = s.nextInt();
		System.out.print("Enter the number of small brick you want to use : ");
		int small = s.nextInt();
		int ProdBig = BigBrickUnit*big;
		int ProdSmall = SmallBrickUnit*small;
		int res = ProdBig+ProdSmall;
		if (goal == res) 
			System.out.println("True. You successfully filled the space.");
		else if(goal < res)
			System.out.println("True. The total number of bricks is larger than the space. Decrease your bricks to fill the required amount of space.");
		else
			System.out.println("False. The total number of bricks is insufficent. Increase your bricks to fill the space.");
	}
}