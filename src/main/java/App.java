import java.util.Random;
import java.util.Scanner;

public class App
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to SECRET NUMBER! Please enter your first name.");
		String player_name = input.nextLine();

		System.out.println("Hello there " + player_name + ", here are the rules:");
		System.out.println("1. You will try to guess a number between 0 and 10");
		System.out.println("2. You have three tries\n");

		if (checkUsersNumber()){
			System.out.println("Congratulations, you guessed the right number!!!");
		} else {
			System.out.println("You did not guess the right number :(");
		}
	}

	static boolean checkUsersNumber() {
		Scanner guessInput = new Scanner(System.in);
		Random r = new Random();
		int secretNumber = r.nextInt(11);
//		System.out.println(secretNumber);
		int guesses = 1;
		int guess;
		int remainingGuesses;

		System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");
		
		while (guesses < 4){
			guess = guessInput.nextInt();
			remainingGuesses = 3 - guesses;
			if(guess > secretNumber){
				if(remainingGuesses == 1){
					System.out.println("You guessed too high, silly! You have " + remainingGuesses +
									   " guess before the game is over");
				} else {
					System.out.println("You guessed too high, silly! You have " + remainingGuesses +
									   " guesses before the game is over");
				}
				guesses ++;
			} else if (guess < secretNumber) {
				if(remainingGuesses == 1){
					System.out.println("You guessed too high, silly! You have " + remainingGuesses +
							" guess before the game is over");
				} else {
					System.out.println("You guessed too high, silly! You have " + remainingGuesses +
							" guesses before the game is over");
				}
				guesses ++;
			} else if (guess == secretNumber) {
				return true;
			}
		}
		return false;
	}
}


