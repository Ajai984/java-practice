class Ball
{
	private double radius;

	Ball(){}
	Ball(double radius)
	{
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
}

class BasketBall extends Ball
{
	String Color;
	double price;

	BasketBall(){}
	BasketBall(double radius,String Color,double price)
	{
		super(radius);
		this.Color = Color;
		this.price = price;
	}
}

class TennisBall extends Ball
{
	String Color;
	double price;

	TennisBall(){}
	TennisBall(double radius,String Color,double price)
	{
		super(radius);
		this.Color = Color;
		this.price = price;
	}
}

class Bag
{
	Ball ball;
	
	public void addBall(Ball ball)
	{
		if(this.ball != null)
		{
			System.out.println("Ball is already there");
		}
		else 
		{
			this.ball = ball;
			System.out.println("Ball Added");
		}
	}

	public void removeBall()
	{
		if(this.ball != null)
		{
			this.ball = null;
			System.out.println("Ball is removed");
		}
		else
			System.out.println("Ball is not there");

	}

	public boolean IsBagEmpty()
	{
		return(this.ball == null);
	}
	
	public void CheckGame()
	{
		if(ball instanceof BasketBall)
		{
			BasketBall bb = (BasketBall) ball;
			System.out.println("You can play with BasketBall with the radius of  "+bb.getRadius()+ " and the color of ball "+bb.Color+" the price of the ball "+bb.price);
		}
		else if(ball instanceof TennisBall)
		{
			TennisBall tb = (TennisBall) ball;
			System.out.println("You can play with TennisBall with the radius of  "+tb.getRadius()+ " and the color of ball "+tb.Color+" the price of the ball "+tb.price);
		}
		else
		{
			System.out.println("You cannot play with any ball");
		}
	}
}

class BallGame 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Bag b = new Bag();
		while(true)
		{
			System.out.println("--------Welcome to the playground----------");
			System.out.println("1. Add Ball");
			System.out.println("2. Remove Ball");
			System.out.println("3. Check wheather the bag is empty");
			System.out.println("4. Check which game we can play");
			System.out.println("5. Exit");
			System.out.println("-------------------------------------------");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			switch (ch) 
			{
				case 1:
					{
						System.out.println("\t1. BasketBall");
						System.out.println("\t2. TennisBall");
						int c = sc.nextInt();
						if(ch == 1)
						{
							System.out.print("Enter radius : ");
							double radius = sc.nextDouble();
							System.out.print("Enter the color : ");
							String color = sc.next();
							System.out.print("Enter the price : ");
							double price = sc.nextDouble();
							b.addBall(new BasketBall(radius,color,price));
						}
						else if(ch == 2)
						{
							System.out.print("Enter radius : ");
							double radius = sc.nextDouble();
							System.out.print("Enter the color : ");
							String color = sc.next();
							System.out.print("Enter the price : ");
							double price = sc.nextDouble();
							b.addBall(new TennisBall(radius,color,price));
						}
						else 
						{
							System.out.println("Invalid Choice");
						}
						break;
					}
				
				case 2:
					{
						b.removeBall();
						break;
					}

				case 3:
					{
						System.out.println(b.IsBagEmpty());
						break;
					}

				case 4:
					{
						b.CheckGame();
						break;
					}

				case 5:
					{
						System.exit(0);
					}
			}
		}
	}
}