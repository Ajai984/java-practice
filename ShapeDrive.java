import java.util.Scanner;
abstract class shape
{
	String color;
	shape(){}
	shape(String color)
	{
		this.color = color;
	}
	abstract double area();
}

class rectangle extends shape
{
	int length;
	int breadth;
	rectangle(){}
	rectangle(String color, int length, int breadth)
	{
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double area()
	{
		return length*breadth;
	}
}

class circle extends shape
{
	double radius;
	circle(){}
	circle(String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	@Override
	public double area()
	{
		return 3.14f*radius*radius;
	}

}

class square extends shape
{
	int side;
	square(){}
	square(String color, int side)
	{
		super(color);
		this.side = side;
	}
	@Override
	public double area()
	{
		return side*side;
	}
}
class ShapeDrive 
{
	public static void main(String[] args) 
	{
		shape s;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("**************************");
			System.out.println("1. Rectangle");
			System.out.println("2. Circle");
			System.out.println("3. Square");
			System.out.println("4. Exit");
			System.out.println("**************************");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			System.out.println("--------------------------");
			switch(ch)
			{
				case 1:
					{

						System.out.print("Enter the color of the rectangle : ");
						String color = sc.next();
						System.out.print("Enter the length of the rectangle : ");
						int length = sc.nextInt();
						System.out.print("Enter the breadth of the rectangle : ");
						int breadth =  sc.nextInt();
						s =  new rectangle(color, length, breadth);
						System.out.println("Area of the rectangle "+s.area()+" and color of the rectangle is "+s.color);
						break;
					}
				case 2:
					{
						System.out.print("Enter the color of the circle : ");
						String color = sc.next();
						System.out.print("Enter the radius of the circle : ");
						int radius = sc.nextInt();
						s =  new circle(color, radius);
						System.out.println("Area of the circle "+s.area()+" and color of the circle is "+s.color);
						break;
					}
				case 3:
					{
						System.out.print("Enter the color of the square : ");
						String color = sc.next();
						System.out.print("Enter the size of the square : ");
						int size = sc.nextInt();
						s =  new square(color, size);
						System.out.println("Area of the square "+s.area()+" and color of the square is "+s.color);
						break;
					}
				case 4:
					System.exit(0);
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}