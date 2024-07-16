import java.util.Scanner;
class Average
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mark1 : ");
		int Mark1 = sc.nextInt();
		System.out.print("Enter Mark2 : ");
		int Mark2 = sc.nextInt();
		System.out.print("Enter Mark3 : ");
		int Mark3 = sc.nextInt();
		float Avg = (Mark1+Mark2+Mark3)/3;
		System.out.println("The Average of three marks is : "+ Avg);
	}
}