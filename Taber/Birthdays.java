import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Birthdays {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(2004, 0, 7, 15, 40);
		
		long day1 = c.getTimeInMillis();
		
		day1 += 1000 * 60 * 60;
		
		c.setTimeInMillis(day1);
		
		System.out.println("new hour = " + c.get(c.HOUR_OF_DAY));
		c.add(c.DATE, 35);
		System.out.println("add 35 days = " + c.getTime());
		c.add(c.DATE, -35);
		System.out.println("sub 35 days = " + c.getTime());
		
		c.setTimeInMillis(day1);
		c.roll(c.DATE, 35);
		System.out.println("roll 35 days = " + c.getTime());
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("What is your birthday? ");
		//String birthday = scanner.nextLine();
		//System.out.println("Your birthday is: " + birthday);
		
		
		System.out.println(now);
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		System.out.println(dft.format(now));
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("When were you born? ");
		String birthday = scanner.nextLine();
		System.out.println("Your birthday is: " + birthday);
		
		String[] parts = birthday.split("/");
		String month = parts[0];
		String dayOfMonth = parts[1];
		String year = parts[2];
		
		Calendar bc = Calendar.getInstance();
		// TODO fix the parsing later!
		bc.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(dayOfMonth));
		
		System.out.println("Your birthday is on a " + bc.getTime());	
		
		
		
		
		
		
	}

}

