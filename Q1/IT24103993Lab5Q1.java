import java.util.Scanner;

public class IT24103993Lab5Q1
{
    public static void main(String[] args)
    {
        //Declaring variables
        int num1, num2, num3;

        //Creating the scanner object
        Scanner lowerandlarger=new Scanner(System.in);
        
        //Requesting user inputs
        System.out.print("Enter the First Integer  :");
        num1=lowerandlarger.nextInt();
        
        System.out.print("Enter the Second Integer :");
        num2=lowerandlarger.nextInt();

        System.out.print("Enter the Third Integer  :");
        num3=lowerandlarger.nextInt();

        //Print the user entered numbers
        System.out.println();
        System.out.println("User Entered Numbers are :"+num1+" "+num2+" "+num3);

         //Finding the smallest
         if(num1<num2&&num1<num3)
         {
             System.out.println("The Smallest Number is :"+num1);
         }
         else if(num2<num1&&num2<num3)
         {
             System.out.println("The Smallest Number is :"+num2);
         }
         else 
         {
             System.out.println("The Smallest Number is :"+num3);
         }

        //Finding the largest
        if(num1>num2&&num1>num3)
        {
            System.out.print("The Largest Number is  :"+num1);
        }
        else if(num2>num1&&num2>num3)
        {
            System.out.print("The Largest Number is  :"+num2);
        }
        else 
        {
            System.out.print("The Largest Number is  :"+num3);
        }
    }
}