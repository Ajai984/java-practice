import java.util.Scanner;

class product
{
	String p_name;
	int p_id;
	double price;
}

class Cart
{
	product[] p = new product[5];

	int i = 0;

	public void addProduct(product p)
	{
		if(i != p.length)
		{
			this.p[i] = p;
			i++;
		}
		else
		{ 
			System.out.println("cart is full!");
		}
	}

	public void removeProduct()
	{	
		if(i<= p.length)
		{
			this.p[i] = null;
			System.out.println("product remoced");
			i++;
		}

	public void checkCartEmpty(product p)
	{
		if(this.p != null)
		{
			this.p = p;
			System.out.println("Cart is not empty");
		}
		else
		{
			System.out.println("Cart is empty");
		}
	}
}

class Amazon
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Cart c = new Cart();
		System.out.print("Enter the product id : ");
		int pdtId = sc.nextInt();
		System.out.print("Enter the product name : ");
		String pdtname = sc.next();
		System.out.println("Enter the price of the product : ");
		double pdtprice = sc.nextDouble();
		System.out.println("*************************************");
	}
}