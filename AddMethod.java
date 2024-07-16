/*Write a program to create parameterized method which accepts int, int and perform addition.*/


class AddMethod
{
	public static void Add(int a, int b)
	{
		int sum = a + b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Add(10,5);
	}
}