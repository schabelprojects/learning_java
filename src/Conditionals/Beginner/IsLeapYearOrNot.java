package Conditionals.Beginner;

import java.util.Scanner;

public class IsLeapYearOrNot {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What year were you born: ");
        int birthyear = scanner.nextInt();

        if (birthyear % 4 == 0 && (birthyear % 100 != 0 || birthyear % 400 == 0)){
            System.out.println("The Year you were born is a Leap Year.");
        } else{
            System.out.println("The Year you were born is no Leap Year.");
        }

        scanner.close();
    }
}
