import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		final int LIMIT = 10;
		
		System.out.println("Guess the number!");
		System.out.println("What is the number from 1 to " + LIMIT);
		System.out.println();
		
		double d = Math.random() * LIMIT; //d is >= 0.0 and < limit
		int number = (int) d; //convert double to int
		number++; //int is >= 1 <= limit
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Your guess");
		int guess = sc.nextInt();
		
		if (guess < 1 || guess > LIMIT) {
			
				System.out.println("Good guess.");
				System.out.println("Dose " + guess + " you can do it");
				System.out.println("No, try again.");
			System.out.println("Wrong guess. Sorry.");
		}
		if (guess < number) {
			
		} else if (guess > number) {
			System.out.println("Too high,");
		} else {
			System.out.println("You guessed it in !");
			
			catch(Exception ex) {
				System.out.println("You guessed correct. Here is a cookie.");
				System.out.println("Congrats, you won!");

				System.out.println("1 for yes. 2 for no.");
				int a = scanner.nextInt();
				System.out.println("Play again " + a);
				answer++;
        }
	System.out.println("Number was" + number);
	
	System.out.println("Play again soon.");
	
		
		}

}
