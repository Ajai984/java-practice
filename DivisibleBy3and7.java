/*write a program to count number of values divisible by 3 and 7 both from m to n*/

class DivisibleBy3And7
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the value of m : ");
		int m = sc.nextInt();
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int count = 0;
		while(m<=n)
		{
			if (m%3==0 && m%7==0)
			{
				count++;
			}
			m++;
		}
		System.out.println("-------------------------");
		System.out.println("The count :" + count);
		System.out.println("-------------------------");

	}
}