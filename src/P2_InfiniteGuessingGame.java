/*
	ISYS 320
	Name(s): Clayton Bruce
	Date: 4/16/2018
*/


import java.util.Random;
import java.util.Scanner;

public class P2_InfiniteGuessingGame {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String playagain ="";
		//making the whole game replayable
		//THE DO WHILE LOOP WONT EXECUTE A SEOCND TIME
		do {
		int secretNumber = getSecretNumber();
		int numberOfGuessesAllowed = 7;

		outputWelcomeMessage();
		int guessesTaken = playGame(secretNumber, numberOfGuessesAllowed);
		outputEndingMessage(guessesTaken, numberOfGuessesAllowed, secretNumber);

		System.out.println("Type (quit) to stop playing");
		
		playagain = console.next();

		}while(!playagain.equals( "quit"));
		
		System.out.println("Thanks for playing goodbye");
	}

	public static void outputWelcomeMessage() {
		System.out.println("This is a guessing game.");
		System.out.println("I picked a random number from 1 to 100.");
		System.out.println("For now you get 7 guesses");
	}

	public static void outputEndingMessage(int guessesTaken, int numberOfGuessesAllowed, int secretNumber) {
		int wins=0;
		int losses = 0;
		if (guessesTaken < numberOfGuessesAllowed) {
			System.out.println("Congratuations, you guessed it!");
			wins++;
			System.out.println("You have won: "+wins+" times!");
		} else {
			System.out.println("The secret number was " + secretNumber + ". Try again.");
			losses++;
			System.out.println("You have lost "+ losses+" times!");
		}
	}

	public static int getSecretNumber() {
		Random generator = new Random();
		return generator.nextInt(100) + 1;
	}

	public static int getNextGuess() {
		Scanner console = new Scanner(System.in);
		int nextGuess;
		do {
			System.out.println("What is your guess? ");
			nextGuess = console.nextInt();

			if (nextGuess < 0 || nextGuess > 100) {
				System.out.println("ERROR: Guess should be between 0 and 100");
			}
		} while (nextGuess < 0 || nextGuess > 100);

		return nextGuess;
	}

	public static int playGame(int secretNumber, int allowedGuesses) {
		int numOfGuessesTaken = 0;
		while (numOfGuessesTaken < allowedGuesses) {
			int nextGuess = getNextGuess();

			if (nextGuess == secretNumber) {
				return numOfGuessesTaken;
			} else {
				System.out.println("Nope, guess again. ");
				if(nextGuess < secretNumber) {
					System.out.println("Your Guess is too low ");
				}
				if(nextGuess > secretNumber) {
					System.out.println("Your Guess is too high");
				}
				numOfGuessesTaken++;
			}
		}

		return numOfGuessesTaken;
	}

}
