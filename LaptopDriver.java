class MotherBoard
{
	int model = 2025;
	double price = 65000d;
}

class Laptop
{
	MotherBoard m = new MotherBoard();
}

class LaptopDriver
{
	public static void main(String[] args) 
	{
		Laptop l = new Laptop();
		System.out.println(l.m.model);
		System.out.println(l.m.price);
	}
}