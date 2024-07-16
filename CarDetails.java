import java.util.Scanner;

class Vehicle
{
	int model;
	Vehicle(){}
	Vehicle(int model)
	{
		this.model = model;
	}
}

class Car extends Vehicle
{
	int no_of_doors;
	String brand;
	double price;
	Car(){}
	Car(int model,int no_of_doors,String brand,double price)
	{
		super(model);
		this.no_of_doors = no_of_doors;
		this.brand = brand;
		this.price = price;
	}
}

class eCar extends Car
{
	int batteryLevel;
	eCar(){}
	eCar(int model,int no_of_doors,String brand,double price,int batteryLevel)
	{
		super(model,no_of_doors,brand,price);
		this.batteryLevel = batteryLevel;
	}
	void display()
	{
		System.out.println("____________________________________________");
		System.out.println("Vehicle model : "+model);
		System.out.println("Number of doors in the car : "+no_of_doors);
		System.out.println("Car Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Battery level : "+batteryLevel+"%");
		System.out.println("____________________________________________");
	}
}

class CarDetails 
{
	 public static void main(String[] args) 
	 {
	 	Scanner sc = new Scanner(System.in);
	 	eCar e = new eCar();
	 	System.out.print("Enter the car model : ");
	 	e.model = sc.nextInt();
	 	System.out.print("Enter no of doors : ");
	 	e.no_of_doors = sc.nextInt();
	 	System.out.print("Enter car brand : ");
	 	e.brand = sc.next();
	 	System.out.print("Enter the price of the car : ");
	 	e.price = sc.nextDouble();
	 	System.out.print("Enter Battery Level : ");
	 	e.batteryLevel = sc.nextInt();
		e.display();
	 }
}