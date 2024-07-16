import java.util.Scanner;
class EncapsulatedPrime 
{
	private int prime;
	
	public int getPrime()
	{
		return prime;
	}
	public void setPrime(int prime)
	{
		int count = 0;
		for(int i = 1; i <= prime; i++ )
		{
			if(prime % i == 0)
				count++;
		}
	
		if(count == 2)
		{
			this.prime = prime;
			System.out.println("valid number");
		}
		else 
		{
				System.out.println("Invaild number");
		}	
	}	
}

class EncapsulatedPrimeMain
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		EncapsulatedPrime e = new EncapsulatedPrime();
		System.out.println(e.getPrime());
		System.out.print("Enter the new value : ");
		int num = s.nextInt(); 
		e.setPrime(num);
		System.out.println(e.getPrime());
	}
}