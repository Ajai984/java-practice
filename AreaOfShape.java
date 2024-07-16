/*write a program to find area of shape(triangle,circle,rectangle)*/
class Area
{
	static void area(double radius)
	{
		double areA = 3.14*radius*radius;
		System.out.println("Area of Circle : "+areA);
	}
	static void area(float base, double height)
	{
		double areA = base * height;
		System.out.println("Area of Rectangle : "+areA);
	}
	static void area(double base, double height)
	{
		double areA = 0.5*base*height;
		System.out.println("Area of Triangle : "+areA);
	}
}

class AreaOfShape
{
	public static void main(String[] args) 
	{
		Area.area(5.5d);
		Area.area(12f,14d);
		Area.area(12d,14d);
	}
}