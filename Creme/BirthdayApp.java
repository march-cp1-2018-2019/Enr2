/**
* Made By Jeremiah Creme...
*/
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;;

public class BirthdayApp {
	public static void main(String[] args) {

		LocalDateTime Date = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY");

		Scanner s = new Scanner(System.in);
		System.out.print("What Is Your Birthday? ");
		try {

			String ans = s.next();
			//a great place for this close statement would be in a finally block after the catch
			s.close();
			System.out.println("Testing if it is your birthday...");
			String[] parts = ans.split("/");
			int month = Integer.parseInt(parts[0]);
			int dayOfMonth = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(parts[2]);

			LocalDate Birthday = LocalDate.of(year, month, dayOfMonth);

			int TodaysDay = Date.getDayOfYear();
			int BirthdayDay = Birthday.getDayOfYear();
			if (TodaysDay == BirthdayDay) {
				System.out.println("\nHappy Birthday!!");
			} else {
				System.out.println("\nIt's not your birthday yet :(");
			}
		} catch (Exception e) {
			System.out.println("Error...");
		}

	}

}
