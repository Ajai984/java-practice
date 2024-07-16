import java.util.Scanner;
class HappyNumber
{
	public static Boolean isSquareAdd(int num)
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
		return (num == 1);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		if(isSquareAdd(num))
			System.out.println(num+" is a happy number.");
		else
			System.out.println(num+" is not a happy number.");
	}
}