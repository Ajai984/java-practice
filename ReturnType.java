import java.util.Scanner;
class ReturnType 
{
	public static String Str()
	{
		String a = "Ajai";
		String b = "Subha";
		String c = a + b;
		return c;
	}
	public static String Str1(String a, String b)
	{
		String c = a + b;
		return c;
	}


	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String a = s.nextLine();
		System.out.print("Enter the second string : ");
		String b = s.nextLine();
		System.out.println(Str());
		System.out.println(Str1(a,b));
	}
}