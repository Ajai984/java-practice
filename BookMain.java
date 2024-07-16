import  java.util.Scanner;
class Book 
{
	int book_id;
	String book_name;
	String AuthorName;
	double book_price;

	public Book(int book_id,String Ttile,String AuthorName,double book_price)
	{
		this.book_id = book_id;
		this.book_name = book_name;
		this.AuthorName = AuthorName;
		this.book_price = book_price;
	}

	public void DisplayDetails()
	{
		System.out.println("Your Book id : "+book_id);
		System.out.println("Your Book name : "+book_name);
		System.out.println("Author Name : "+AuthorName);
		System.out.println("Book Price : "+book_price);
	}
}

class BookMain
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the book id : ");
		int id = s.nextInt();
		System.out.print("Enter the book name : ");
		String b_name = s.next();
		System.out.print("Enter the book author : ");
		String author = s.next();
		System.out.print("Enter the book price : ");
		double price = s.nextDouble();

		Book b1 = new Book(id,b_name,author,price);

		b1.DisplayDetails();
	}
}