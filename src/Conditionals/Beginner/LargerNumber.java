package Conditionals.Beginner;

import java.util.Scanner;

public class LargerNumber {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        if ( a > b ){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        scanner.close();
    }
}
