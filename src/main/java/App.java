import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to SECRET NUMBER! Please enter your first name.");
		String playerName = input.nextLine();
		//take the player's name and save it to a variable called player_name


		//Insert the player's name below
		System.out.println("Hello there, " + playerName + " " + "Here are the rules:");
		System.out.println("1. You will try to guess a number between 0 and 10");
		System.out.println("2. You have three tries");
		System.out.println("Begin.");
		boolean checkNum = checkUsersNumber();
		if(checkNum == true) {
			System.out.println("You got it! Congrats, you beat luck! Go to the bank, get a loan, and head to the casino!!");
		}
		else{
			System.out.println("Sorry. The machines win again! .... Damn SkyNet.");



		}


	}

	//run the function to check the user's number
	//If the user guessed correctly, print a congratulations message, otherwise print a failure message
	static boolean checkUsersNumber() {
		Scanner input = new Scanner(System.in);
		//Code for getting a random number
		Random r = new Random();
		int secretNumber = r.nextInt(11);
		//Create a loop to get the player's guess and check it

		for (int count = 0; count < 3; count++) {
			System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");
			int guessNum = input.nextInt();
			if (guessNum == secretNumber) {
				return true;
			} else if (guessNum > secretNumber) {
				System.out.println("You guessed too high, silly! You have " + (2 - count) + " guesses before the game is over");
			} else if (guessNum < secretNumber) {
				System.out.println("You guessed too low, silly! You have " + (2 - count) + " more guesses before the game is over");

			}
		}
		return false;
	}
}



