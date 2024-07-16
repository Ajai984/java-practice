class Passenger
{
	String name = "Sheela";
}

class Bus
{
	Passenger p;

	public void addPassenger(Passenger p)
	{
		this.p = p;
	}
}

class BusDriver
{
	public static void main(String[] args) 
	{
		Bus b = new Bus();
		b.addPassenger(new Passenger());
		System.out.println(b.p.name);
	}
}