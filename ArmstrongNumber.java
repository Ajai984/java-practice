/*write a program to check whether given number is armstrong number*/

import java.util.Scanner;

class ArmstrongNumber 
{
    public static int Count(int num) 
    {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int Power(int x, int n)
    {
    	int pow = 1;
    	for (int i = 1; i <= n ; i++ )
    	{
    		pow = pow * x;
    	}
        return pow;
    }

    public static boolean isArmstrong(int num) 
    {
    	int temp = num;
    	int count = Count(num);
    	int sum = 0;
        while (num != 0) 
        {
            int last = num % 10;
            int pow = Power(last, count);
           	sum = sum + pow;
            num = num / 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
