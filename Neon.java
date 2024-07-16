/*write a program to whether the given number is neon number*/
import java.util.Scanner;
class Neon
{
	public static int Square(int num)
	{
		int power = num * num;
		return power;
	}
	public static boolean isNeonNumber(int num)
	{
		int sum = 0; 
		int power = Square(num);
		int temp = power;
		while(temp!=0)
		{
			int last = temp % 10;
			sum+=last;
			temp/=10;
		}
		return sum == num;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = s.nextInt();
		if(isNeonNumber(num))
			System.out.println("The given number is a Neon number");
		else
			System.out.println("The given number is not a Neon number");
	}

}