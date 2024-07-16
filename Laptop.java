class Laptop 
{
	String brand;
	int model;
	double price;
	int ram;

	public Laptop()
	{

	}

	public Laptop(String brand)
	{
		this();
		this.brand=brand;
	}

	public Laptop(String brand, int model)
	{
		this(brand);
		this.model = model;
	}

	public Laptop(String brand, int model, double price)
	{
		this(brand, model);
		this.price = price;
	}
	
	public Laptop(String brand, int model, double price, int ram)
	{
		this(brand, model, price);
		this.ram = ram;
	}

	public void Display()
	{
		System.out.println("Brand name : "+brand);
		System.out.println("Model number : "+model);
		System.out.println("Price : "+price);
		System.out.println("Ram Size : "+ram);
		
	}
}