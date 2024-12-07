import java.util.Scanner;

public class IT24103993Lab5Q3
{
public static void main(String[] args)
{
	final double roomcharge=48000;
	final int discount1=10;
	final int discount2=20;

	Scanner reservations=new Scanner(System.in); //Creating the scanner object

	System.out.print("Enter the Start Date (1-31):"); //Read the start date
	int sdate=reservations.nextInt();
	
	System.out.print("Enter the End Date (1-31):"); //Read the end date
	int edate=reservations.nextInt();

	//Validating the date ranges
	if(edate<=sdate)
	{
	System.out.println("Error: Start Date must be less than End Date");
	return;
	}

	if(sdate<1||sdate>31||edate<1||edate>31)
	{
	System.out.println("Error: Days Must be between 1 and 31");
	return;
	}

	//Calculating the room charge 
	int recdays=edate-sdate;
	
	if(recdays<3)
	{
	double payment=recdays*roomcharge;
	System.out.println("Room Charges Per Day: Rs."+roomcharge);
	System.out.println("Number of Days Recerved:"+recdays);
	System.out.println("Total Amount to be Paid:"+payment);
	return;
	}

	//Discount for 3-4 days
	if(recdays>=3&&recdays<=4)
	{
	double total=recdays*roomcharge;
	double payment=total-(total*discount1/100);
	System.out.println("Room Charges Per Day: Rs."+roomcharge);
	System.out.println("Number of Days Recerved:"+recdays);
	System.out.println("Total Amount to be Paid:"+payment);
	return;
	}
	
	//Discount for 5 or more days
	if(recdays>=5)
	{
	double total=recdays*roomcharge;
	double payment=total-(total*discount2/100);
	System.out.println("Room Charges Per Day: Rs."+roomcharge);
	System.out.println("Number of Days Recerved:"+recdays);
	System.out.println("Total Amount to be Paid:"+payment);
	return;
	}


}
}