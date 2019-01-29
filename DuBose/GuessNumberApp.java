/**
 * Abby DuBose
 * Jan 25, 2019
 */
package chap11;

import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String [] args) {
		
		final int LIMIT = 10;
		int answer = 0;
		
		while( answer == 0) {
			System.out.println("just one second...");
			System.out.println();
			
			System.out.println("Guess the number!");
			System.out.println("I'm thinking of a number from 1 to " + LIMIT);
			System.out.println();
			
			// get a number between 1 and the limit
			double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
			int number = (int) d; // convert double to it
			number++; // int is >= 1 and <= limit
	
	
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Your Guess: " );
				int guess = sc.nextInt();
	
		
				if (guess < 1 || guess > LIMIT) {
					System.out.println("Dude come on now.");
					System.out.println("Dose " + guess + " look like its in between 1 and 10?");
					System.out.println("No, I didn't think so either.");
				}		
				else if (guess > 1 && guess < LIMIT) {
				
					if (guess < number) {
						System.out.println(guess + " Is Too Low");
					}
					else if (guess > number) {
						System.out.println(guess + " Is Too High");
					} 
					else {
						System.out.println("you guessed it !");
					}
				}
				System.out.println("The Correct Number was " + number);
			}
			catch(Exception ex) {
				System.out.println("Look at what you've done. Because of you, I am going to die.");
				System.out.println("GoodBye crule world...");
				answer++;
				
			}
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Would you like to play again? ");
		// note for teacher: I tried to make it into a string. but it wasn't working so..
			//I decided to just make it an int.
			
			System.out.println("0 for yes. 1 for no.");
			int a = scanner.nextInt();
			System.out.println("You said " + a);
			
			if(a == 0) {
				System.out.println("Here we go again!");
				System.out.println();
			}
			else if(a == 1) {
				System.out.println("GoodBye");
				answer++;
			}
		
		}
		
		
		
		System.out.println("come back soon!");
	
		
	}
}	


