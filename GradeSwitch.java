import java.util.Scanner;
class GradeSwitch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		int marks = sc.nextInt();
		String grade;
        switch (marks / 10) {
            case 10:
            	{
	            	grade = "A+";
	            	break;
            	}
            case 9:
            	{
	                grade = "A+";
	                break;
            	}
            case 8:
            	{
	                grade = "A";
	                break;
	            }
            case 7:
                {
                	grade = "B+";
                	break;
                }
            case 6:
                {
                	grade = "B";
                	break;
                }
            case 5:
            	{
            		grade = "C";
            		break;
            	}
            case 4:
            	{
            		grade = "D";
            		break;
            	}
            default:
                grade = "Fail, Give Supplement once again";
        }
        System.out.println("Your Grade : " +grade);
	}
}