import java.util.Scanner;
class Phone
{
	private String OS;

	public String getOS()
	{
		return OS;
	}
	Phone(){}
	Phone(String OS)
	{
		this.OS = OS;
	}
}

class Oneplus extends Phone
{
	public String brand;
	public double price;
	public int model;

	Oneplus(String brand, double price, int model, String OS)
	{
		super(OS);
		this.brand = brand;
		this.price = price;
		this.model = model;
	}

	public void displayDetails()
	{
		System.out.println("****************************");
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Model : "+model);
		System.out.println("****************************");
		System.out.println("Mobile OS : "+getOS());
	}

}

class PhoneDriver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Phone p = new Phone();
		System.out.print("Enter your mobile brand : ");
		String brand =  sc.next();
		System.out.print("Enter your mobile price : ");
		double price = sc.nextDouble();
		System.out.print("Enter your mobile model : ");
		int model = sc.nextInt();
		System.out.print("Enter your OS : ");
		String os = sc.next();
		Oneplus o = new Oneplus(brand, price, model, os);
		o.displayDetails();
	}
}