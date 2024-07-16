import java.util.Scanner;
class LaptopDrive 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of objects to be created: ");
		int size = s.nextInt();
		Laptop [] l = new Laptop[size]
		
		for (int i = 0; i < l.length ; i++) 
		{
			System.out.println("Enter the "+(i+1)+" data :-");
			System.out.println("----------------------------------");
			System.out.print("Enter the Laptop Brand : ");
			String brand = s.next();
			System.out.print("Enter the Laptop Model : ");
			int model = s.nextInt();
			System.out.print("Enter the Laptop Price: ");
			double price = s.nextDouble();
			System.out.print("Enter the Ram Size : ");
			int ram = s.nextInt();

			l[i] = new Laptop(brand, model, price, ram);
		}
		System.out.println("*********************************");
		for(int i = 0; i < l.length; i++)
		{
			l[i].Display();
		}
	}
}