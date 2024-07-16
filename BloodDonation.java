import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Enter your weight: ");
		int weight = sc.nextInt();
		if(age > 18 && age <= 50)
		{
			if(weight>55)
			{
				System.out.println("You are eligible to donate blood");
			}
			else
			{
				System.out.println("You are not eligible to donate blood as your weight is below 55kg");
			}
		}
		else
		{
			System.out.println("You are not eligible to donate blood");
		}
	}
}