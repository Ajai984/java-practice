import java.util.Scanner;
class Age
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age<60)
		{
			if(age>=1 && age<=12)
			{
				System.out.println("Child");
			}
			else if (age>=13 && age<=20) 
			{
				System.out.println("Teenage");
			}
			else if (age>=21 && age<=29)
			{
				System.out.println("Teenage Adult");
			}
			else if (age>=30 && age<=59)
			{
				System.out.println("Adult");
			}
		}
		else
			System.out.println("Senior");
	}
}