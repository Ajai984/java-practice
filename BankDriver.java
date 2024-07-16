import java.util.*;

class Account
{
	long Acc_no;
	String Acc_HolderName;
	String ifsc;
	Account(long Acc_no,String Acc_HolderName,String ifsc)
	{
		this.Acc_no = Acc_no;
		this.Acc_HolderName = Acc_HolderName;
		this.ifsc = ifsc;
	}
}

class Bank
{
	Account[] a = {new Account(3431531l,"ABC","ICIC01200324"),new Account(5675765l,"DEF","ICIC01200324"), new Account(4323254l,"GHI","ICIC01200324")};
	Scanner s = new Scanner(System.in);
	int i = 0;
	public void Search(long Acc_no)
	{
		for(i = 0; i < a.length;i++)
		{
			if (a[i].Acc_no == Acc_no) 
			{
				System.out.println("Account found with Account number "+Acc_no);
			}
			else 
			{
				System.out.println("Account not found");
			}
		}
	}

}

class BankDriver 
{
	public static void main(String[] args) 
	{
		
	}
}