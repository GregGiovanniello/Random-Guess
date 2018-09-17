// imports JOptionPane package for dialog boxes
import javax.swing.JOptionPane;

public class RandomGues
{
   public static void main(String[] args)
   {
	  // variables
      int guess;
      int result;
      String msg;
      int attempts = 1;
	  
	   // constants
      final int LOW = 1;
      final int HIGH = 10; 
	  
	  // generates random number between 1 and 10
      result = LOW + (int)(Math.random() * HIGH);
	  
	  // prompts user to guess a number between 1 and 10
      guess = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Try to guess my number between " + LOW + " and " + HIGH));
		
	// start of while loop that will loop the dialog box until the user guesses correctly
      while(guess != result)
      {
		 // if statement that prompts the user if their guess is too low
         if(guess < result) 
            msg = "Your guess was too low";
		
         else // prompts user if their guess is too high
            msg = "Your guess was too high";
			
		// parses the integer of guess into a message of "Guess again"
         guess = Integer.parseInt(JOptionPane.showInputDialog(null,
            msg + "\nGuess again"));
			
         ++attempts; // counts number of attempts
		 
      } //end of while loop
	  
	  // output message when the user enters the correct number
      JOptionPane.showMessageDialog(null,"Correct! You got it in " + 
        attempts + " attempts");
   }
}