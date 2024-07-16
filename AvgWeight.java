/*take the weight of 5 persons and calculate the avg of all 5 persons weight (result should be in whole number)*/

import java.util.Scanner;
class AvgWeight 
{
	public static void main(String[] args)
	{
		int avg = 0; 
		float weight = 0;
		Scanner s = new Scanner(System.in);
		for (int i = 1; i<=5 ;i++ ) 
		{
			System.out.print("Enter the weight of person "+i+" :");
			weight = s.nextFloat();
			avg+=weight;
		}
			avg /=5;
		System.out.println("Avg Weight : "+avg);
	}
}