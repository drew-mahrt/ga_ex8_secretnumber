import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to SECRET NUMBER! Please enter your first name.");
        //take the player's name and save it to a variable called player_name
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();

        //Insert the player's name below
        System.out.println("Hello there, " + firstName + ".  Here are the rules:");
        System.out.println("1. You will try to guess a number between 0 and 10");
        System.out.println("2. You have three tries");

        //run the function to check the user's number
        //If the user guessed correctly, print a congratulations message, otherwise print a failure message

        boolean newGuess = checkUsersNumber();
        if (newGuess == true){
            System.out.print("You got it!  Good job!");
        }
        else {
            System.out.print("Sorry, you got it wrong.  Better luck next time");
        }

    }

    static boolean checkUsersNumber() {
        //Code for getting a random number
        Random r = new Random();
        int secretNumber = r.nextInt(11);
        System.out.println(secretNumber);





        //Create a loop to get the player's guess and check it

        for (int remainingGuesses = 3; remainingGuesses > -1; remainingGuesses--) {
            System.out.println("Your SECRET NUMBER has been chosen - guess a number between 0 and 10!");
            //Get the user's guess
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();

            //Check the guess
            if (guess > secretNumber) {

                //check to see if the player_guess is more than the @random_number
                System.out.println("You guessed too high, silly! You have " + remainingGuesses + " guesses before the game is over");

            } else if (guess < secretNumber) {
                //else
                System.out.println("You guessed too low, silly! You have " + remainingGuesses + " guesses before the game is over");

            } else {
                return true;
            }

        }
        return false;

    }
}


/*        while(count < 3 || guess == secretNumber) {
            count = count++;
            System.out.println("Wrong, guess again.")
            guess = input.nextInt();
        }
*/