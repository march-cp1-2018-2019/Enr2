package dates;

// Noah 1/30/2019

// TEACHER NOTES: Excellent!
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator{
  public static void main(String[] args){
    System.out.println("Welcome to the Age Calculator\n");
    
    // Get the current date
    LocalDate currentDate = LocalDate.now();

    // Get input from the the user
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your date of birth (YYYY-MM-DD): ");
    String dateOfBirthString = sc.nextLine();
    System.out.println();
    
    // Get and validate user's date of birth

    try{
      LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);

      if(dateOfBirth.isAfter(currentDate)){
        System.out.println("That date is in the future.");
        return;
      }
      
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, YYYY");

      // Format and print user's date of birth
      System.out.println("Your date of birth is " + dtf.format(dateOfBirth));

      // Format and print the current date
      System.out.println("The current date is " + dtf.format(currentDate));

      // Calculate and print the user's age
      System.out.println("Your age is " + ChronoUnit.YEARS.between(dateOfBirth, currentDate));
    }catch(DateTimeParseException ex){
        System.out.println("Invalid date");
    }finally{
        sc.close();
    }
  }
}
