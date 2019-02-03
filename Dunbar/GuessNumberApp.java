package dates;

// Noah 1/29/2019

import java.util.Scanner;

public class GuessNumberApp{
  public static void main(String[] args){
    final int MAX = 10;

    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("");

    System.out.println("Welcome to Guess A Number!");
    System.out.println("Enter 'quit' to stop playing the game.");

    while(true){
      int num = (int)(Math.random() * 10) + 1;

      System.out.print("Guess a number from 1 to " + MAX + ": ");

      int guess = 0;
      try{
        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("quit")){
          break;
        }

        guess = Integer.parseInt(input);
      }catch(NumberFormatException ex){
        System.out.println("That's not a number!");
        continue;
      }

      if(guess < 1){
        System.out.println("Too low!");
        continue;
      }

      if(guess > MAX){
        System.out.println("Too high!");
        continue;
      }

      if(guess == num){
        System.out.println("Correct!");
      }else{
    	  // TEACHER NOTES: one thing you might consider added here is
    	  // some feedback to the user...was their guess too high or too low
    	  // compare to the random number num.
    	  // You could also let the keep guessing until they get it right and 
    	  // then display the number of guesses it took them to get it right.
        System.out.println("That's not right.");
      }
    }

    System.out.println("Thank you for playing!");

    scanner.close();
  }
}
