import java.util.Scanner;
// TEACHER NOTES: you are missing some imports here from the original file.  
// Don't delete these, you need them.

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        // TEACHER NOTES: this isn't compiling because the import statement is missing.
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        
        		
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): 2001-12-27 ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        
        @SuppressWarnings("resource")
        // TEACHER NOTES: don't declare this again...its already on line 16
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // TEACHER NOTES: It doesn't look like you finished this one. 
        // I hope that going over this class in class helped you out.
        // You can definitely turn this in again for full credit.
        
    }
    
}
