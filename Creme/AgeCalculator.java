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
			String[] parts = dateOfBirthString.split("-");
			int year = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int dayOfMonth = Integer.parseInt(parts[2]);
			valid = true;
			LocalDate Birthday = LocalDate.of(year, month, dayOfMonth);

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
