import java.util.Scanner;

public class IT24103993Lab5Q2
{
public static void main(String[] args)
{

	Scanner prize=new Scanner(System.in); //Creating the scanner object

	char nofcustomers; //Declare variables
	
	System.out.print("Enter the Number of New Members Introduced: "); //Reading the input 
	nofcustomers=prize.next().charAt(0);

	//Check the prize
	switch(nofcustomers)
	{
		case'0':System.out.print("No Prize");
		break;

		case'1':System.out.print("Prize is a : Pen");
		break;

		case'2':System.out.print("Prize is an : Umbrella");
		break;

		case'3':System.out.print("Prize is a : Bag");
		break;

		case'4':System.out.print("Prize is a : Traveling Chair");
		break;

		default:System.out.print("Prize is a : Headphone");
	}
}
}
