class Parent
{
	String Name = "Ajai";
	int num = 231;
}

class Child extends Parent
{
	String Name = "Subha";
	int num = 135;
}

class Child2 extends Parent
{
	String Name = "Anjali";
	int num = 001;
}

class Upcasting
{
	public static void main(String[] args) 
	{
	  	Parent p = new Child();
		System.out.println("Upcasting");
		System.out.println(p.Name);
		System.out.println(p.num);
		System.out.println("Downcasting");
		Child ch = (Child)p;
		System.out.println(ch.Name);
		System.out.println(ch.num);
		System.out.println("Upcasting");
		Parent p1 = new Child2();
		System.out.println(p1.Name);
		System.out.println(p1.num);
		System.out.println("Downcasting");
		Child2 c = (Child2)p1;
		System.out.println(c.Name);
		System.out.println(c.num);
 	}
}