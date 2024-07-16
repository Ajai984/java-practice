class Fruit
{
	String origin = "Chennai";
}

class Apple extends Fruit
{
	String taste = "Sweet";
}

class Orange extends Fruit
{
	String color = "Orange";
}

class Pineapple extends Fruit
{
	double price = 100d;
}
class FruitApple 
{
	public static void addFruit(Fruit f)
	{
		if(f instanceof Apple)
		{
			Apple a = (Apple)f;
			System.out.println(a.taste);
		}
		else if (f instanceof Orange) 
		{
			Orange o = (Orange)f;
			System.out.println(o.color);
		}
		else if(f instanceof Pineapple)
		{
			Pineapple p = (Pineapple)f;
			System.out.println(p.price);
		}
	}
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean flag = true;
		while(flag == true)
		{
			System.out.println("-------------------------------");
			System.out.println("Your Choices");
			System.out.println("1.Apple");
			System.out.println("2.Orange");
			System.out.println("3.Pineapple");
			System.out.println("4.Exit");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			System.out.println("-------------------------------");
			switch(ch)
			{
				case 1:
					{
						addFruit(new Apple());
						break;
					}
				case 2:
					{
						addFruit(new Orange());
						break;
					}
				case 3:
					{
						addFruit(new Pineapple());
						break;
					}
				case 4:
					{
						System.out.println("Tata bye bye");
						System.out.println("-------------------------------");
						System.exit(0);
					}
				default:
					System.out.println("Invalid choice!!");
			}
		}
	}	
}