class Fruit
{
	String origin;
	Fruit(){}
	Fruit(String origin)
	{
		this.origin = origin;
	}
}

class Apple extends Fruit
{
	String taste;
	String color;
	
	Apple(){}
	Apple(String origin,String taste,String color)
	{
		super(origin);
		this.taste = taste;
		this.color = color;
	}
	void display()
	{
		System.out.println("___________________________");
		System.out.println("Apple");
		System.out.println("___________________________");
		System.out.println("The origin : "+origin);
		System.out.println("The taste : "+taste);
		System.out.println("The color : "+color);
	}
}
class Orange extends Fruit
{
	String taste;
	String color;
	Orange(){}
	Orange(String origin,String taste,String color)
	{
		super(origin);
		this.taste = taste;
		this.color = color;
	}
	void display()
	{
		System.out.println("___________________________");
		System.out.println("Orange");
		System.out.println("___________________________");
		System.out.println("The origin : "+origin);
		System.out.println("The taste : "+taste);
		System.out.println("The color : "+color);
	}
}

class FruitVendor
{
	public static void main(String[] args) 
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("___________________________");
		System.out.println("1. Apple");
		System.out.println("2. Orange");
		System.out.println("___________________________");
		System.out.print("Enter your Choice : ");
		int ch = s.nextInt();
		switch(ch)
		{
		case 1:
			Apple a = new Apple("Chennai","Sweet","Red");a.display();break;
		case 2:
			Orange o = new Orange("Tambaram","Sour","Orange");o.display();break;
		}
	}
}