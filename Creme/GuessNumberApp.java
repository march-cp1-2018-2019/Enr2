package chap11;


import java.util.Scanner;



public class GuessNumberApp {
	public static void main(String[] args) {
		String bug = "\u001b[5;4;32m";
		System.out.println(bug+"test");

		int num = (int) (Math.random() * 9);
		num++;
		int numString = num - 1;
		Scanner input = new Scanner(System.in);
		String[] nums = new String[10];
		nums[0] = "one";
		nums[1] = "two";
		nums[2] = "three";
		nums[3] = "four";
		nums[4] = "five";
		nums[5] = "six";
		nums[6] = "seven";
		nums[7] = "eight";
		nums[8] = "nine";
		nums[9] = "ten";
		boolean leave = false;
		System.out.print("I Have Thought Of A Number 1-10\nTry To Guess It : ");
		String guess = input.next();
		while (leave == false) {
			try {

				int numGuess = Integer.parseInt(guess);
				if (numGuess < 10 || numGuess > 1) {

					if (numGuess == num) {
						System.out.println("\nYou Guessed The Number");
						leave = true;
					} else if (numGuess > num) {
						System.out.println("\nYou Guessed To High");
					} else if (numGuess < num) {
						System.out.println("\nYou Guessed To Low");
					} else {
						System.out.println("Error");
					}

				} else if (numGuess > 10 || numGuess < 1) {
					System.out.println("\nPlease Type A Number 1-10");
				}
			} catch (Exception e) {
				for (int x = 0; x <= 9; x++) {
					if (nums[x].equals(guess)) {
						if (x == numString) {
							System.out.println("\nYou Guessed The Number");
							leave = true;
						} else if (x > numString) {
							System.out.println("\nYou Guessed To High");
						} else if (x < numString) {
							System.out.println("\nYou Guessed To Low");
						}
					}
				}
			}
			if (leave == false) {
				System.out.print("Try To Guess It Again : ");
				guess = input.next();
			}

		}

	}

}
