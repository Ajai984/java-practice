class Engine
{
	String brand = "Spyder";
	double price = 1500000d;
}

class Wheels
{
	String brand = "MRF";
	double price = 50000d;
}

class Car
{
	Engine e = new Engine();
	Wheels w = new Wheels(); 
}

class CarDriver
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		System.out.println("Engine brand : "+c.e.brand);
		System.out.println("Engine price : "+c.e.price);
		System.out.println("Wheels brand : "+c.w.brand);
		System.out.println("Price of wheels : "+c.w.price);
	}
}