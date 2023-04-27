package Conditionals.Beginner;

import java.util.Scanner;

public class IsPositiveOrNegativeNumber {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to determin if it is a positive or negative number: ");

        int number = scanner.nextInt();

        if(number >= 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        scanner.close();
    }

}
