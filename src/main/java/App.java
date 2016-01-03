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

		//Insert the player's name below
		System.out.println("Hello there, " + player_name + ".  Here are the rules:");
		System.out.println("1. You will try to guess a number between 0 and 10");
		System.out.println("2. You have three tries");

		//run the function to check the user's number
		//If the user guessed correctly, print a congratulations message, otherwise print a failure message
		Boolean result = checkUsersNumber();
		if (result){
			System.out.println("Congratulations, you guessed the secret number!");
		} else {
			System.out.println("Sorry, you did not guess the secret number.");
		}

	}

	static boolean checkUsersNumber()
	{
		//Code for getting a random number
		Random r = new Random();
		int secretNumber = r.nextInt(11);
		Scanner input = new Scanner(System.in);

		//Create a loop to get the player's guess and check it

		System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");

		for (int i = 2; i >= 0; i--) {
			//Get the user's guess
			int guess = -1;
			Boolean accept = false;
			String errMsg = "Invalid guess; please enter an integer between 0 and 10.";
			while (!accept) {
				try {
					guess = input.nextInt();
					if (guess >= 0 && guess <= 10) {
						accept = true;
					} else {
						System.out.println(errMsg);
						input.nextLine();
					}
				} catch (Exception e) {
					System.out.println(errMsg);
					input.nextLine();
				}
			}

			//Check the guess
			if (guess == secretNumber) {
				return true; // user guessed number correctly w/in 3 tries
			} else if (guess > secretNumber) {
				//check to see if the player_guess is more than the @random_number
				System.out.println("You guessed too high, silly! You have " + i + " guess(es) before the game is over");
			} else {
				System.out.println("You guessed too low, silly! You have " + i + " guess(es) before the game is over");
			}
		}

		return false; // if user did not guess secret number in 3 tries
	}
}


