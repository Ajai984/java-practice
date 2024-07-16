import java.util.Scanner;

class Sim {
    private long sim_no; 
    private String sim_provider;
    private double sim_rate;

    public long getSimNumber() 
    {
        return sim_no;
    }

    public void setSimNumber() 
    {
    	Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        long phno = s.nextLong();
    	long sim_no = phno;
    	int count = 0;
    	long temp = sim_no;
    	while(sim_no>0)
    	{
    		count++;
    		sim_no/=10;
    	}
    	if(count == 10)
    	{
    		this.sim_no = temp;
    		System.out.println("Number updated.");
    	}
    	else
    	{
    		System.out.println("Invalid Number.");
    	}
        /* 
        int count = phno.length();
        if (count == 10) {
            System.out.println("Valid number");
            this.sim_no = phno;
        } else {
            System.out.println("Invalid number");
        }*/
    }

    public String getProvider() 
    {
        return sim_provider;
    }
    
    public void setProvider()
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Enter your service provider: ");
        String provider = s.nextLine();
        if((provider.equalsIgnoreCase("Jio")||(provider.equalsIgnoreCase("Airtel"))))
        {
			this.sim_provider = provider;
			System.out.println("Sim provider changed.");
        }
        else 
        {
        	System.out.println("Invalid Choice");
        }
	}

    public double getPrice() 
    {
        return sim_rate;
    }

	public void displayDetails()
	{
		System.out.println("________________________________");
		System.out.println("Sim Number : "+getSimNumber());
		System.out.println("Sim provider : "+getProvider());
		System.out.println("Sim rate : "+getPrice());
		System.out.println("_________________________________");
	}
}

