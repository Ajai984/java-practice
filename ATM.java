import java.util.*;
import java.lang.*;
class ATM 
{
	static	double balance = 100000d;

	public static void WithDraw()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println("Your available amount: "+balance);
		System.out.print("Enter the Withdraw amount : ");
		double withdraw = s.nextDouble();
		if (withdraw > 4000) 
		{
			if(balance > withdraw && withdraw % 50 == 0)
			{
				balance -= withdraw;
				System.out.println("Transaction Complete");
				System.out.println("Withdrawal amount: "+ withdraw);
				System.out.println("Your current balance: "+balance);
			}
			else if(withdraw % 50 != 0)
			{
				System.out.println("Transaction Incomplete");
				System.out.println("The withdrawal amount should end with a zero.");
			}
			else
			{
				System.out.println("Transaction Incomplete");
				System.out.println("Insufficient balance");
			}
		}
		else
		{
			System.out.println("Transaction Incomplete");
			System.out.println("Withdraw amount should be more than 4000");
		}
		System.out.println("-------------------------");
	}

	public static void Deposit()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println("Your available amount: "+balance);
		System.out.print("Enter the amount you want to deposit :");
		double depo = s.nextDouble();
		if(depo > 100 && depo % 50 == 0)
		{
			balance += depo;
			System.out.println("Successfully deposited.");
			System.out.println("Your current balance: "+balance);
		}
		else if(depo%50 != 0)
		{
			System.out.println("Transaction Incomplete");
		}
		else
			System.out.println("The Deposit should be more than Rs.100");
		System.out.println("-------------------------");
	}
	
	public static void CheckBalance()
	{
		System.out.println("-------------------------");
		System.out.println("Your balance : "+balance);
		System.out.println("-------------------------");
	}
	
	public static int getOTP()
	{
		Random r = new Random();
		int otp = r.nextInt(1000,10000);
		/*int max = 1000;
		int min = 10000;
		
		int otp = (int)Math.random()*(max - min)+min;
		*/
		return otp;
	}
	public static void Switch()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("********************");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.println("********************");
		System.out.print("Enter the operation : ");
		int ch = s.nextInt();
		switch(ch)
		{
		case 1:
			{
				int generatedOTP = getOTP();
				System.out.println("Your otp is : "+generatedOTP);
				int otp = s.nextInt();
				if(otp == generatedOTP)
				{
					WithDraw();
					Switch();
				}
				else
					System.out.println("Invalid OTP!!");
				break;
			}
		case 2:
			{
				Deposit();
				Switch();
				break;
			}
		case 3:
			{
				CheckBalance();
				Switch();
				break;
			}
		case 4:
			{
				break;
			}
		default:
			{
				System.out.println("*******************");
				System.out.println("Invalid choice");
				System.out.println("*******************");
				Switch();
			}
		}
	}
}