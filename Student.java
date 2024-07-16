class Student
{
	static String CollegeName = "Panimalar Engineering College";
	String Name;
	int RollNo;
	long PhNo;
	char Gender;

	public void DisplayDetails()
	{
		System.out.println("Name of the College : "+CollegeName);
		System.out.println("Name : "+Name);
		System.out.println("Roll Number : "+RollNo);
		System.out.println("Phone Number : "+PhNo);
		System.out.println("Gender : "+Gender);
	}
}