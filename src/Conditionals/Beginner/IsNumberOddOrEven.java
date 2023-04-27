package Conditionals.Beginner;

import java.util.Scanner;

public class IsNumberOddOrEven {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to determin if it is odd or even: ");
        int number = scanner.nextInt();
    
        if(number % 2 == 0){
            System.out.println("This number is an even number.");
        } else {
            System.out.println("This number is an odd number.");
        }
    
        scanner.close();
    }
}
