class ClassLoadingProcess
{
	static int a = 2;

	static
	{
		a = 3;
	}

	static boolean b = m1(a);

	public static boolean m1(int a)
	{
		return (a % 2 == 0);
	}

	public static void main(String[] args) 
	{
		if(b)
			System.out.println("Developer");
		else
			System.out.println("Tester ");
	}
}