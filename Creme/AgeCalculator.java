/**
* Made By Jeremiah Creme
*/
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Age Calculator\n");

		LocalDate CurrentDate = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your date of birth (YYYY-MM-DD): ");
		String dateOfBirthString = sc.nextLine();
		System.out.println();
		boolean valid;
		try {
			// This is one way to do it but be careful that you check that 
			// your array parts is not null first before you access an index.
			// otherwise you may get a NullPointerException.  
			// What would happen if the user entered a bad date format or used a different
			// delimeter character other than -
			String[] parts = dateOfBirthString.split("-");
			// add here: if(parts!=null && parts.length==3) 
			int year = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int dayOfMonth = Integer.parseInt(parts[2]);
			valid = true;
			// You could use the DateTimeFormatter here to parse based on a format
			// lowercase b here for birthday
			LocalDate Birthday = LocalDate.of(year, month, dayOfMonth);
			
			// i like this here
			if (valid) {
				// DONE :)
				System.out.println("\nYour date of birth is " + dtf.format(Birthday));

				// DONE :)
				System.out.println("The current date is " + dtf.format(CurrentDate));
				
				int age = CurrentDate.compareTo(Birthday);
				if(CurrentDate.getDayOfYear() < Birthday.getDayOfYear()) {
					age -= 1;
				}
				System.out.println("Your age is "+age);
			}
		} catch (Exception e) {
			System.out.println("You Have Entered An Incorrect Date Or");
			System.out.println("Something That Is Not A Date...");

		}
	}
}
