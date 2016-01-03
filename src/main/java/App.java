import java.util.Random;
import java.util.Scanner;

public class App
{
    private final static int NUMBER_OF_GUESSES = 3;

	public static void main(final String[] args)
	{
        final Scanner scanner = new Scanner(System.in);
		System.out.print("Welcome to SECRET NUMBER! Please enter your first name:\t");

        //take the player's name and save it to a variable called player_name
        final String playerName = scanner.nextLine();

		//Insert the player's name below
		System.out.printf("Hello there, %s.  Here are the rules:\n", playerName);
		System.out.println("1. You will try to guess a number between 0 and 10");
		System.out.println("2. You have three tries");

		//run the function to check the user's number
		//If the user guessed correctly, print a congratulations message, otherwise print a failure message
        if (checkUsersNumber(scanner)) {
            System.out.println("Congratulations!!");
        } else {
            System.out.println("You Lose!!");
        }
	}

	static boolean checkUsersNumber(final Scanner scanner)
	{

		//Code for getting a random number
		final Random r = new Random();
		final int secretNumber = r.nextInt(11);
        int usersGuess = -1;

		//Create a loop to get the player's guess and check it
        for (int guessesLeft = NUMBER_OF_GUESSES; guessesLeft > 0; --guessesLeft) {
            System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");
            //Get the user's guess
            usersGuess = scanner.nextByte();
            //Check the guess
            if (usersGuess == secretNumber) {
                return true;
            } else if (usersGuess > secretNumber) {
                System.out.printf("You guessed too high, silly! You have %d guesses before the game is over\n", guessesLeft);
            } else {
                System.out.printf("You guessed too low, silly! You have %d guesses before the game is over\n"
                        , guessesLeft);
            }
        }

        return false;
	}
}


