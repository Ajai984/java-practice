import java.util.Scanner;
class StudentMain
{
	public static void main(String[] args) 
	{
		
		Student.CollegeName = "Panimalar Engineering College"; 
		
		/*Student s1 = new Student();

		s1.Name = "Ajai";
		s1.RollNo = 231;
		s1.PhNo = 6369959397l;
		s1.Gender = 'M';

		s1.DisplayDetails();
		
		Student s2 = new Student();

		s2.Name = "Subha";
		s2.RollNo = 154;
		s2.PhNo = 8925030765l;
		s2.Gender = 'F';

		s2.DisplayDetails();*/

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the count of Student : ");
		int stuCount = s.nextInt();
		for(int i = 1; i<=stuCount;i++)
		{
			Student Si = new Student();
			System.out.print("Enter the name of the Student : ");
			Si.Name = s.next();
			System.out.print("Enter the Roll Number of the Student : ");
			Si.RollNo = s.nextInt();
			System.out.print("Enter the Phone Number of the Student : ");
			Si.PhNo = s.nextLong();
			System.out.print("Enter the Gender of the Student : ");
			Si.Gender = s.next().charAt(0);
			Si.DisplayDetails();
		}
	}
}