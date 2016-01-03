import java.util.Random;
import java.util.Scanner;

public class App
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to SECRET NUMBER! Please enter your first name.");
		//take the player's name and save it to a variable called player_name
		Scanner input = new Scanner(System.in);
        String player_name = input.nextLine();
        System.out.println(player_name);

		//Insert the player's name below
		System.out.println("Hello there, " + player_name + ".  Here are the rules:");
		System.out.println("1. You will try to guess a number between 0 and 10");
		System.out.println("2. You have three tries");

		//run the function to check the user's number
		//If the user guessed correctly, print a congratulations message, otherwise print a failure message
        checkUsersNumber();
	}

	static boolean checkUsersNumber()
	{
		//Code for getting a random number
		Random r = new Random();
		int secretNumber = r.nextInt(11);

        //Create a loop to get the player's guess and check it
		System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");
        for (int remaining_guesses = 3; remaining_guesses >= 0 ; remaining_guesses--) {
//            int remaining_guesses = count;

            //Get the user's guess
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();

            //Check the guess
            if (guess > secretNumber) {
                //check to see if the player_guess is more than the @random_number
                System.out.println("You guessed too high, silly! You have " + remaining_guesses + " guesses before the game is over");
            } else if (guess < secretNumber) {
                System.out.println("You guessed too low, silly! You have " + remaining_guesses + " guesses before the game is over");
            } else (guess == secretNumber){
                System.out.println("You guessed the right number!");
            }
        }
        return true;
	}
}


