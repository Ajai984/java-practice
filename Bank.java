abstract class RBI
{
	public abstract double roi();
}

class SBI extends RBI
{
	@Override
	public double roi()
	{
		return 7.8d;
	}
}

class Axis extends RBI
{
	@Override
	public double roi()
	{
		return 12d;
	}
}

class Bank
{`
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		RBI r;
		System.out.println("***************************");
		System.out.println("1.SBI");
		System.out.println("2.Axis");
		System.out.println("***************************");
		System.out.print("Enter your choice : ");
		int ch = s.nextInt();
		System.out.println("---------------------------");
		switch(ch)
		{
			case 1:
				{
					r = new SBI();
					System.out.println("Rate of interest of SBI is "+r.roi());
					break;
				}
			case 2: 
				{
					r = new Axis();
					System.out.println("Rate of interest of Axis is "+r.roi());
					break;
				}
			default:
				{
					System.out.println("invalid choice!");
				}
		}
	}
}