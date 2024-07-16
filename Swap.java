import java.util.Scanner;
class Swap 
{
	public static void SwapWithTemp(int n1, int n2)
	{
		int temp = n1;
		n1 = n2;
		n2 = n1;
		System.out.println("After Swapping");
		System.out.println(n1+"\n"+n2);
	}
	public static void SwapWithoutTemp1(int n1, int n2)
	{
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 + n2;
		System.out.println("After Swapping");
		System.out.println(n1+"\n"+n2);
	}
	public static void SwapWithoutTemp2(int n1, int n2)
	{
		n1 = n1 * n2;
		n2 = n1 / n2;
		n1 = n1 * n2;
		System.out.println("After Swapping");
		System.out.println(n1+"\n"+n2);
	}
	public static void SwapWithXOR(int n1, int n2)
	{
		n1 = n1 ^ n2;
		n2 = n1 ^ n2;
		n1 = n1 ^ n2;
		System.out.println("After Swapping");
		System.out.println(n1+"\n"+n2);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = s.nextInt();
		System.out.print("Enter the value of b: ");
		int b = s.nextInt();
		SwapWithTemp(a,b);
		SwapWithoutTemp1(a,b);
		SwapWithoutTemp2(a,b);
		SwapWithXOR(a,b);
	}
}