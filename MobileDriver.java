import java.util.Scanner;
class Sim
{
	long PhNo;
}

class Mobile
{
	Sim s;

	public void addSim(Sim s)
	{
		if (this.s == null) 
		{
			this.s = s;
			System.out.println("Sim number inserted.");
		}
		else
		{
			System.out.println("Sim already there");
		}
	}

	public void removeSim()
	{
		if(this.s != null)
		{
			this.s = null;
			System.out.println("Sim removed");
		}
		else
		{
			System.out.println("Insert a sim!!");
		}
	}

}

class MobileDriver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Mobile m = new Mobile();
		boolean flag = true;	
		while(flag)
		{

			System.out.println("--------------------------");
			System.out.println("1. Insert Sim");
			System.out.println("2. Remove Sim");
			System.out.println("3.Exit");
			System.out.println("--------------------------");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				{	
					System.out.print("Enter the phone number :");
					long phno = sc.nextLong();
					m.addSim(new Sim());
					m.s.PhNo = phno;
					System.out.println("Sim number is : " + m.s.PhNo);
					break;
				}
			case 2:
				{
					m.removeSim();
					break;
				}
			case 3:
				{
					flag = false;
					break;
				}
			default:
				System.out.println("Invalid Choice");		
			}
		}
	}
}