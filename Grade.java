import java.util.Scanner;
class Grade
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your mark: ");
		int mark = sc.nextInt();
		if (mark>40) 
		{
				if (mark==100)
				{
					System.out.println("Excellent");
				}
				else if (mark>=91 && mark<100)
				{
					System.out.println("A+");
				}
				else if(mark>=81 && mark<=90)
				{
					System.out.println("A");
				}
				else if (mark>=71 && mark<=80) 
				{
					System.out.println("B+");
				}
				else if (mark>=61 && mark<=70) 
				{
					System.out.println("B");
				}
				else if (mark>=51 && mark<=60)
				{
					System.out.println("C");
				}
				else if (mark>=41 && mark<=50)
				{
					System.out.println("D");
				}
		}
		else
		{
			System.out.println("Fail");
		}	
	}
}