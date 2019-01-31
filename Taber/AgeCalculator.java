package dates;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        
        		
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): 2001-12-27 ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
    }
    
}
