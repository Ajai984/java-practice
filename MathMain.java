/*Write a program to perform mathematical operation(add,sub,product,div with 2 and 3 numbers) with the help of method overloading*/

class MathOp
{
	static void add(int a, int b)
	{
		int add = a+b;
		System.out.println("Sum of two numbers : "+add);
	}
	static void add(int a,int b,int c)
	{
		int add = a+b+c;
		System.out.println("Sum of three numbers : "+add);
	}
	static void sub(int a, int b)
	{
		int sub = a-b;
		System.out.println("Sub of two numbers : "+sub);
	}
	static void sub(int a,int b,int c)
	{
		int sub = a-b-c;
		System.out.println("Sub of three numbers : "+sub);
	}
	static void mul(int a, int b)
	{
		int mul = a*b;
		System.out.println("product of two numbers : "+mul);
	}
	static void mul(int a,int b,int c)
	{
		int mul = a*b*c;
		System.out.println("product of three numbers : "+mul);
	}
	static void div(int a, int b)
	{
		int div = a/b;
		System.out.println("division of two numbers : "+div);
	}
}

class MathMain 
{
	public static void main(String[] args) 
	{
		MathOp.add(2,4);
		MathOp.add(3,5,3);
		MathOp.sub(2,1);
		MathOp.sub(5,1,1);
		MathOp.mul(5,5);
		MathOp.mul(5,5,1);
		MathOp.div(4,2);
	}
}