import java.util.Scanner;
class SquareSum
{
	public static void SquareAdd(int num)
	{
		while(num!=1 && num!=4)
		{	
			int last = 0;
			int sum = 0;
			while(num != 0)
			{
				last = num % 10;
				int sq = last * last;
				sum += sq;
				num /= 10;
			}
			num = sum;
		}
		if (num == 1) 
			System.out.println("yes");
		else
			System.out.println("no");
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		SquareAdd(num);
		
	}
}