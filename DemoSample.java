class Demo
{
	Demo()
	{
		System.out.println("hi");
	}
	Demo(int x, int y)
	{
		this(20);
		System.out.println("Hello");
		System.out.println(x+ " " +y);
	}
	Demo(int x)
	{
		System.out.println(x);
	}
}

class Sample extends Demo
{
	Sample()
	{
		System.out.println("No Argument Constructor");
	}

	Sample(int x, int y)
	{
		super(x,y);
		System.out.println("Argument Constructor");
	}
}

class DemoSample 
{
	public static void main(String[] args) 
	{
		Sample s = new Sample(50,100);
	}
}