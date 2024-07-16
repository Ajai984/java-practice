class Parent
{
	int x = 20;
	private int b = 10;
	public static void m1()
	{
		System.out.println("inside static method in parent class");
	}

	public void m2()
	{
		System.out.println(b);
		System.out.println("inside non static method in parent class");
	}
}

class Child extends Parent
{
	int a = 45;
	public static void m3()
	{
		System.out.println("inside static method in child class");
	}
	
	public void m4()
	{
		System.out.println("inside non static method in child class");
	}
}

class ParentChildMain
{
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		System.out.println(p.x);
		p.m1();
		p.m2();
		System.out.println("**********************");
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.x);
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println("***********************");
		/*System.out.println(p.a);
		p.m3();
		p.m4();*/  
	}
}
