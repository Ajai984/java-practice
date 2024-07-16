/* write a program to print even numbers from 1 to 50 */
class While
{
	public static void main(String[] args) 
	{
		int a = 1;
		while (a <= 50) 
		{
			if (a%2==0) 
			{
				System.out.println(a);
			}
			a++;
		}
	}
	
}