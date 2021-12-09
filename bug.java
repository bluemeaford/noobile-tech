
import java.util.Scanner; // needed for Scanner Class
 

// program demonstrates do while loop.

public class bug
{
   public static void main(String[] args)
   {
      int  value;      // to hold data entered by the user
      int  sum = 0;    // initialize the sum   
      String choice=null;     // to hold input from user  
 
      // Create a Scanner object for user input.
      Scanner input = new Scanner(System.in);
         System.out.print("Welcome to Bobby’s addition calculator!  \n");
   
     
		do	
			  {
			     // Get the value from the user.
			     System.out.print("Please enter an integer to be added: ");
			     value = input.nextInt();
 
			     // add value to sum
			     sum = sum + value;
			  
			     // Get the choice from the user to add more number
			     System.out.print("Do you want to continue? \nPlease enter 'yes' or no: ");
			     choice = input.next();
			  }

			      while (choice.equals( "yes"));
			  	
			  
      //Display the total.     
      System.out.println("Total added integer : " + sum +  "\nHave a nice Day!" );
      input.close();
			  }			     
	
}

