import java.util.Scanner;
class Area
{
	public static float Triangle()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the base : ");
		int base = s.nextInt();
		System.out.print("Enter the height : ");
		int height = s.nextInt();
		float area = 0.5f* base * height;
		System.out.println("The Area of Triangle is "+area);
		return area;
	}
	public static float Circle()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		float radius = s.nextFloat();
		float vol = 3.14f * radius * radius;
		System.out.println("The Volume of Circle is "+vol);
		return vol;
	}
	public static int Cube()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = s.nextInt();
		int vol = a * a * a;
		System.out.println("The Volume of Cube is "+vol);
		return vol;
	}
	public static int Cuboid()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the lenght of cuboid: ");
		int l = s.nextInt();
		System.out.print("Enter the breadth of cuboid: ");
		int b = s.nextInt();
		System.out.print("Enter the height of cuboid: ");
		int h = s.nextInt();
		int vol = l * b * h;
		System.out.println("The Volume of Cuboid is "+vol);
		return vol;

	}
	public static float Cylinder()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius of cylinder :");
		float r = s.nextFloat();
		System.out.print("Enter the height of cylinder :");
		float h = s.nextInt();
		float vol = 3.14f*r*r*h;
		System.out.println("The Volume of Cylinder is "+vol);
		return vol;

	}
	public static void Vowel()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Character :");
		char x = s.next().charAt(0);
		if(x == 'A'||x == 'a'||x == 'E'||x == 'e'||x == 'I'||x == 'i'||x == 'O'||x == 'o'||x == 'U'||x == 'u')
			System.out.println(x+ " is a vowel");
		else
			System.out.println(x+ " is not a vowel");
	}
	public static void Switch() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("*******************************");
		System.out.println("1.Area of Triangle");
		System.out.println("2.Volume of Circle");
		System.out.println("3.Volume of Cube");
		System.out.println("4.Volume of Cuboid");
		System.out.println("5.Volume of Cylinder");
		System.out.println("6.Vowels");
		System.out.println("7.Exit");
		System.out.println("*******************************");
		System.out.print("Enter your Choice: ");
		int ch = s.nextInt();
		switch(ch) 
		{
			case 1:
				{
					Triangle();
					break;
				}
			case 2:
				{
					Circle();
					break;
				}
			case 3:
				{
					Cube();
					break;
				}
			case 4:
				{
					Cuboid();
					break;
				}
			case 5:
				{
					Cylinder();
					break;
				}
			case 6:
				{
					Vowel();
					break;
				}
			case 7:
				break;
			default:
				{
					System.out.println("////////////////////////");
					System.out.println("Invalid Choice!");
					System.out.println("////////////////////////");
					Switch();
				}
		}
	}
		public static void main(String[] args) 
		{
			Switch();
		}
}