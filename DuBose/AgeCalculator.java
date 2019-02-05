package chap11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        // Get the current date
        LocalDate today = LocalDate.now();

        // Get input from the the user
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // Get and validate user's date of birth
	       try {
	    	   DateTimeFormatter inDateFormat = DateTimeFormatter.ofPattern("yyyy-mm-dd",Locale.ENGLISH);
	    	   LocalDate dob = LocalDate.parse(dateOfBirthString,  inDateFormat);
	       
			
	        // If user's date of birth is valid
	    		if(dob.isAfter(today)) {
	    			System.out.println("Date of Birth must occur before today");
	    		}else {
	    			DateTimeFormatter outDateFormat = DateTimeFormatter.ofPattern("MM dd, YYYY");
	    		
		            // Format and print user's date of birth
		            System.out.println("Your date of birth is " + outDateFormat.format(dob));
		
		            // Format and print the current date
		            System.out.println("The current date is " + outDateFormat.format(today));
		
		            // Calculate and print the user's age
		            System.out.println("Your age is " + (ChronoUnit.YEARS.between(dob, today)));
	    		}
       }catch(DateTimeParseException dtpe){
    	   dtpe.printStackTrace();
    	   System.out.print("sorry, I couldnt read your date format");
       }
    }
}
