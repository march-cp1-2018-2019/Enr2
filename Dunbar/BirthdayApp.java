package dates;

// Noah 1/29/2019

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayApp{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // TEACHER NOTES: perhaps tell the user the input format in this prompt.
    System.out.print("What is your birthday? ");
    String birthday = scanner.nextLine();

    String[] parts = birthday.split("/");

    if(parts.length != 3){
      System.out.println("Invalid date. The format is 'Month/Day/Year'");

      scanner.close();
      return;
    }

    int month, dayOfMonth, year;
    try{
      month = Integer.parseInt(parts[0]);
      dayOfMonth = Integer.parseInt(parts[1]);
      year = Integer.parseInt(parts[2]);
    }catch(NumberFormatException e){
      System.out.println("Looks like you didn't give just numbers for the date.");

      scanner.close();
      return;
    }

    if(month < 1 || month > 12){
      System.out.println(month + " is not a valid month. It must be between 1 and 12 inclusivly.");

      scanner.close();
      return;
    }

    if(dayOfMonth < 1 || dayOfMonth > 31){
      System.out.println(dayOfMonth + " is not a valid day.");

      scanner.close();
      return;
    }

    LocalDate date = LocalDate.of(year, month, dayOfMonth);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE");

    System.out.println("Your birthday was on a " + dtf.format(date));

    scanner.close();
  }
}
