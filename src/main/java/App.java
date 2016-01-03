import java.util.Random;
import java.util.Scanner;

public class App
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to SECRET NUMBER! Please enter your first name.");
		//take the player's name and save it to a variable called player_name
		Scanner input = new Scanner(System.in);
		String player_name = input.next();

		//Insert the player's name below
		System.out.println("Hello there, " + player_name + ".  Here are the rules:");
		System.out.println("1. You will try to guess a number between 0 and 10");
		System.out.println("2. You have three tries");

		boolean userAnswer = checkUsersNumber();
		if (userAnswer == true){
			System.out.println("Congratulations!");}
		else {System.out.println("Try again!");}
	}

	static boolean checkUsersNumber() {
		Random r = new Random();
		int secretNumber = r.nextInt(11);
		System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");

		for(int i=0; i<3; i++){
			Scanner guess = new Scanner(System.in);
			int userGuess = guess.nextInt();
		if(userGuess > secretNumber){
			System.out.println("You guessed too high, silly! You have " + (2-i) + " guesses before the game is over");}
		else if (userGuess < secretNumber){
			System.out.println("You guessed too low, silly! You have " + (2-i) + " guesses before the game is over");}
		else if (userGuess == secretNumber){
			System.out.println("You guessed it!");
			return true;
		}}
		return false;
	}
}


